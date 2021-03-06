package bg.bot.tradebot.components;

import bg.bot.tradebot.entities.enums.Currency;
import bg.bot.tradebot.entities.enums.Strategy;
import bg.bot.tradebot.entities.enums.TimeGranularity;
import lombok.Data;

@Data
public class BotSettings {
    private Currency fromCurrency, toCurrency;
    private TimeGranularity timeGranularity;
    private int maxCandles;
    private boolean started = false;
    private boolean testingMode = true;
    private double fiatAmountLimit; // Max trade amount of your default fiat currency (EUR or USD)
    private double cryptoAmountLimit; // Max trade amount of your cripto currency (BTC, ETH etc.)
    private double stopLoss; // Fraction of price you don't want to go below - 0.01 means it will sell when gain is below -1% of buying price
    private double atrStopLoss;
    private double safetyFactor;
    private double target; // Fraction of buying price - 0.02 means is will sell when gain reaches 2%
    private double atrTarget;
    private double rsiMin, rsiMax; //RSI thresholds
    private int rsiLength, atrLength;
    private int rsiListLength;
    private double crashIndicator;
    private Strategy strategy;
    private int emaLength;

    //default settings
    public BotSettings() {
        timeGranularity = TimeGranularity.MINUTES1;
        fromCurrency = Currency.BTC;
        toCurrency = Currency.EUR;
        maxCandles = 60;
        safetyFactor = 2;
        fiatAmountLimit = 25;
        cryptoAmountLimit = 500;
        stopLoss = 0.01;
        atrStopLoss = 2;
        target = 0.04;
        atrTarget = 3.5;
        rsiMin = 25;
        rsiMax = 75;
        rsiLength = 15;
        atrLength = 14;
        crashIndicator = 0.12;
        strategy = Strategy.MACD_CMF;
        emaLength = 50;
    }
}