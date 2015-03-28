package com.lsoftware.streams.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SearchTerminalOperationsExample {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

        Optional<Integer> first = integers.stream().findFirst();
        System.out.println("First: " + first.get());

        boolean result;

        result = integers.stream().anyMatch(x -> x == 5);
        System.out.println("Any number equals 5? " + result);

        result = integers.stream().allMatch(x -> x > 3);
        System.out.println("Are all numbers greater then 3? " + result);

        Optional<Integer> any = integers.stream().findAny();
        System.out.println("Impredictable result: " + any.get());
    }

}
