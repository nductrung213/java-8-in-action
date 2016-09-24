/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.me.examples.java8.designpattern.composition;

import java.math.BigDecimal;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author trung
 */
public class CalculateNAVTest {

    @Test
    public void testComputeStockWorth() {
        CalculateNAV calculateNAV = new CalculateNAV(ticket -> new BigDecimal("6.01"));
        BigDecimal expected = new BigDecimal("6010.00");
        assertEquals(0, calculateNAV.computeStockWorth("G00G", 1000).compareTo(expected), 0.001);
    }
}
