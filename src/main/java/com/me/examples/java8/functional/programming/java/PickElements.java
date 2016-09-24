package com.me.examples.java8.functional.programming.java;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author trung
 */
public class PickElements {

    private static final Predicate<String> START_WITH_N = s -> s.startsWith("N");
    private static final Function<String, Predicate<String>> START_WITH_LETTER = letter -> name -> name.startsWith(letter);

    public static void main(String[] args) {
        final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

        printStartsWith(friends, "friends", START_WITH_N);

        // Ex2
        // Reusing Lambda expressions
        final List<String> editors = Arrays.asList("Brian", "Jackie", "John", "Mike");
        final List<String> comrades = Arrays.asList("Kate", "Ken", "Nick", "Paula", "Zach");

        printStartsWith(editors, "editors", START_WITH_N);
        printStartsWith(comrades, "comrades", START_WITH_N);

        // Ex3
        printStartsWith(friends, "friendsStartWithB", START_WITH_LETTER.apply("B"));
        printStartsWith(editors, "editorsStartWithB", START_WITH_LETTER.apply("B"));
    }

    private static void printStartsWith(final List<String> collection, String collectionName, Predicate<String> startWith) {
        List<String> elementsStartsWithN = collection.stream()
                .filter(startWith)
                .collect(Collectors.toList());
        System.out.println(String.format("%s: Found %d names", collectionName, elementsStartsWithN.size()));
    }
}
