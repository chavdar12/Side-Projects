package bg.bot.tradebot.entities.enums;

import lombok.Getter;

public enum Currency {
    EUR(2),
    USD(2),
    BTC(5),
    ETH(4),
    DOGE(0),
    XRP(0),
    LTC(5),
    MIOTA(0),
    BEST(0),
    LINK(2),
    PAN(0),
    DOT(4),
    XLM(1),
    CHZ(2),
    ADA(3);

    @Getter
    private final int amountPrecision;

    Currency(int precision) {
        this.amountPrecision = precision;
    }
}