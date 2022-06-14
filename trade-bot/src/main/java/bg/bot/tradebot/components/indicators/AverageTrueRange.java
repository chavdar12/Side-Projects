package bg.bot.tradebot.components.indicators;

import bg.bot.tradebot.entities.BpCandlestick;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;

//@Slf4j
public class AverageTrueRange implements Indicator {
    @Getter
    private final ArrayList<Double> atrList = new ArrayList<>();
    @Setter
    private ArrayList<BpCandlestick> candles;
    @Getter
    private Double last = 0.0;
    @Setter
    @Getter
    private int atrLength = 14, atrMaxListSize = 5;

    @Override
    public Double calc() {
        if (candles.size() < atrLength + 2) {
            last = 0.0;
            return last;
        }
        ArrayList<Double> TrVarsList = new ArrayList<>();
        ArrayList<Double> TrList = new ArrayList<>();
        for (int i = candles.size() - atrLength; i < candles.size(); i++) {
            BpCandlestick candle = candles.get(i);
            double prevClose = candles.get(i - 1).getClose();
            TrVarsList.clear();
            TrVarsList.add(candle.getHigh() - candle.getLow());
            TrVarsList.add(candle.getHigh() - prevClose);
            TrVarsList.add(prevClose - candle.getLow());
            TrList.add(Collections.max(TrVarsList));

        }
        //log.info("TrList: " + TrList.toString());
        last = ExponentialMovingAverage.simpleAverage(TrList, atrLength);
        atrList.add(last);
        if (atrList.size() > atrMaxListSize) {
            atrList.remove(0);
        }
        return last;
    }

    @Override
    public boolean shouldBuy() {
        throw new UnsupportedOperationException("Not applicable for ATR indicator");
    }

    @Override
    public boolean shouldSell() {
        throw new UnsupportedOperationException("Not applicable for ATR indicator");
    }

    @Override
    public void clear() {
        atrList.clear();
    }

    @Override
    public void setValues(ArrayList<Double> values) {
        throw new UnsupportedOperationException("ATR uses BpCandlestick instead of values<double> as source");
    }
}