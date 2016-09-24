/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.me.examples.java8.functional.programming.java;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author trung
 */
public class PickAnElement {

    private static final Function<String, Predicate<String>> START_WITH_LETTER = letter -> name -> name.startsWith(letter);

    public static void main(String[] args) {
        final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
        final String letter = "N";

        Optional<String> personStartWithN = friends.stream()
                .filter(START_WITH_LETTER.apply(letter)).findAny();
        System.out.println(String.format("A name starting with %s: %s",
                letter, personStartWithN.orElse("No name found")));
    }
}
