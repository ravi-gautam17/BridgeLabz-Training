package streamapi.stockpricelogger;

import java.util.*;
import java.util.stream.*;

public class StockPriceLogger {
    public static void main(String[] args) {

        List<Double> stockPrices = Arrays.asList(
            2450.50,
            2460.75,
            2448.30,
            2475.10,
            2468.90
        );
        stockPrices.stream()
        .forEach(price -> System.out.println("Stock Price: ₹" + price));
}
}

