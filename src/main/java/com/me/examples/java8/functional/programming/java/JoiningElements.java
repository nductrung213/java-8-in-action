/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.me.examples.java8.functional.programming.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author trung
 */
public class JoiningElements {

    public static void main(String[] args) {
        final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

        String printFriends = friends.stream().collect(Collectors.joining(", "));
        System.out.println(printFriends);
    }
}
