package com.me.examples.java8.functional.programming.java;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * total the prices greater than 20, discount by 10%
 *
 * @author trung
 */
public class DiscountFunction {

    public static void main(String[] args) {
        List<BigDecimal> prices = Arrays.asList(new BigDecimal(10), new BigDecimal(30),
                new BigDecimal(17), new BigDecimal(20), new BigDecimal(15), new BigDecimal(18),
                new BigDecimal(45), new BigDecimal(12));
        
        BigDecimal totalOfDiscountedPrices = prices.stream()
                .filter(p -> p.compareTo(new BigDecimal(20)) > 0)
                .map(p -> p.multiply(new BigDecimal(0.9)))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println("Total of discounted prices: " + totalOfDiscountedPrices);
    }
}
