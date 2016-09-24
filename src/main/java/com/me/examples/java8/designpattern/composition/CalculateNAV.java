package com.me.examples.java8.designpattern.composition;

import java.math.BigDecimal;
import java.util.function.Function;

/**
 *
 * @author trung
 */
public class CalculateNAV {

    private final Function<String, BigDecimal> priceFinder;

    public CalculateNAV(Function<String, BigDecimal> priceFinder) {
        this.priceFinder = priceFinder;
    }

    public BigDecimal computeStockWorth(String ticker, int shares) {
        return priceFinder.apply(ticker).multiply(BigDecimal.valueOf(shares));
    }
}
