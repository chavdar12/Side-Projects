package bg.bot.tradebot.components.indicators;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

@Slf4j
public class MACD implements Indicator {
    @Getter
    private final ArrayList<Double> macd = new ArrayList<>();
    @Getter
    private final ArrayList<Double> signal = new ArrayList<>();
    @Getter
    private final ArrayList<Double> histogram = new ArrayList<>();
    private final ExponentialMovingAverage fastEma = new ExponentialMovingAverage();
    private final ExponentialMovingAverage slowEma = new ExponentialMovingAverage();
    private final ExponentialMovingAverage signalEma = new ExponentialMovingAverage();
    private ArrayList<Double> values = new ArrayList<>();
    private int signalDuration = 0;
    @Getter
    @Setter
    private int listLength = 6;
    @Getter
    @Setter
    private int fastLength, slowLength, signalLength, maxSignalDuration;
    @Getter
    private Double last, lastSignal, lastHistogram;


    public MACD() {
        this.maxSignalDuration = 2;
        setParams(12, 26, 9);
        signalEma.setValues(macd);
    }

    public MACD(ArrayList<Double> values) {
        this();
        setValues(values);
    }

    public void setParams(int fastLength, int slowLength, int signalLength) {
        this.fastLength = fastLength;
        this.slowLength = slowLength;
        this.signalLength = signalLength;
        fastEma.setEmaLength(fastLength);
        slowEma.setEmaLength(slowLength);
        signalEma.setEmaLength(signalLength);
    }

    @Override
    public Double calc() {
        if (signalDuration > 0) {
            signalDuration--;
        } else if (signalDuration < 0) {
            signalDuration++;
        }
        last = fastEma.calc() - slowEma.calc();
        if (values.size() > slowLength) {
            macd.add(last);
        }
        lastSignal = signalEma.calc();
        lastHistogram = last - lastSignal;
        if (macd.size() > signalLength) {
            signal.add(lastSignal);
            histogram.add(lastHistogram);
        }
        if (histogram.size() > listLength) {
            signal.remove(0);
            histogram.remove(0);
        }
        if (macd.size() > signalLength + 2) {
            macd.remove(0);
        }
        log.debug("histogram list = \n" + histogram);
        log.debug("signal list = \n" + signal);
        log.debug("macd list = \n" + macd);
        return last;
    }

    @Override
    public boolean shouldBuy() {
        if (signalDuration > 0) {
            return true;
        }
        if (lastHistogram > 0 && histogram.get(histogram.size() - 2) < 0) {
            signalDuration = maxSignalDuration;
            return true;
        }
        return false;
    }

    @Override
    public boolean shouldSell() {
        if (signalDuration < 0) {
            return true;
        }
        if (lastHistogram < 0 && histogram.get(histogram.size() - 2) > 0) {
            signalDuration = -maxSignalDuration;
            return true;
        }
        return false;
    }

    @Override
    public void setValues(ArrayList<Double> values) {
        this.values = values;
        fastEma.setValues(values);
        slowEma.setValues(values);
    }

    @Override
    public void clear() {
        fastEma.clear();
        slowEma.clear();
        macd.clear();
        signal.clear();
        histogram.clear();
    }
}