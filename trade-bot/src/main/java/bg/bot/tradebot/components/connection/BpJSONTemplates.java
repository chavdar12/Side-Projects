package bg.bot.tradebot.components.connection;

import bg.bot.tradebot.entities.BpCandlestick;
import bg.bot.tradebot.entities.Order;
import bg.bot.tradebot.entities.enums.Currency;
import bg.bot.tradebot.entities.enums.OrderSide;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

@Service
@Data
@Slf4j
public class BpJSONTemplates {
    private String output;
    private Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").create();

    public String authentication(String key) {
        output = "{\"type\": \"AUTHENTICATE\", \"api_token\": \"" + key + "\"}";
        log.debug(output);
        return output;
    }

    public String subscriptionToCandles(String fromCurrency, String toCurrency, int period, String unit) {
        JSONObject jo = new JSONObject();
        jo.put("type", "SUBSCRIBE")
                .put("channels", new JSONArray()
                        .put(new JSONObject().put("name", "CANDLESTICKS")
                                     .put("properties", new JSONArray()
                                             .put(new JSONObject()
                                                          .put("instrument_code", fromCurrency + "_" + toCurrency)
                                                          .put("time_granularity", new JSONObject()
                                                                  .put("unit", unit)
                                                                  .put("period", period)
                                                          )
                                             )
                                     ))
                );
        output = jo.toString();
        log.debug(output);
        return output;
    }

    public String subscriptionToOrders() {
        JSONObject jo = new JSONObject();
        jo.put("type", "SUBSCRIBE")
                .put("channels", new JSONArray()
                        .put(new JSONObject().put("name", "ORDERS"))
                );
        output = jo.toString();
        log.debug(output);
        return output;
    }

    public BpCandlestick parseCandle(String candleJSON) {
        log.trace("Parsed:\n" + candleJSON);
        return gson.fromJson(candleJSON, BpCandlestick.class);
    }

    public Order parseOrder(String orderJSON) {
        return gson.fromJson(orderJSON, Order.class);
    }

    public List<BpCandlestick> parseCandleList(String candleListJSON) {
        JSONArray ja = new JSONArray(candleListJSON);
        List<BpCandlestick> list = new ArrayList<>();
        for (int i = 0; i < ja.length(); i++) {
            list.add(parseCandle(ja.get(i).toString()));
        }
        log.trace("Parsed list: " + list);
        return list;
    }

    public String getJSONtype(String message) {
        String type = new JSONObject(message).get("type").toString();
        log.debug("processed TYPE = " + type);
        return type;
    }

    public String createOrder(Currency fromCurrency, Currency toCurrency, OrderSide side, double amount) {
        int precision = fromCurrency.getAmountPrecision();
        log.debug("Precision: " + precision);
        BigDecimal bd = new BigDecimal(amount).setScale(fromCurrency.getAmountPrecision(), RoundingMode.DOWN);
        String strAmount;
        if (precision == 0) {
            strAmount = String.valueOf((int) amount);
        } else {
            strAmount = bd.toPlainString();
        }
        String strOrder = gson.toJson(new Order(String.format("%s_%s", fromCurrency.name(), toCurrency.name()), side.name(), strAmount));
        JSONObject order = new JSONObject(strOrder);
        JSONObject json = new JSONObject()
                .put("type", "CREATE_ORDER")
                .put("order", order);
        log.debug(json.toString(4));
        return json.toString();
    }
}