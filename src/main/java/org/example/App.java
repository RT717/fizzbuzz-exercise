package org.example;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static List<String> fizz(int number) {
        List<String> numbers = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            boolean isDivisibleByThreeWithoutRest = i % 3 == 0;
            boolean isDivisibleByFiveWithoutRest = i % 5 == 0;
            boolean isDivisibleByBoth = i % 3 == 0 & i % 5 == 0;

            if (isDivisibleByBoth) {
                numbers.add("fizzbuzz");
            } else if (isDivisibleByThreeWithoutRest) {
                numbers.add("fizz");
            } else if (isDivisibleByFiveWithoutRest) {
                numbers.add("buzz");
            } else {
                numbers.add(String.valueOf(i));
            }
        }
        return numbers;
    }

    public static List<String> initList(int i) {
        return null;
    }
}

