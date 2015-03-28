package com.lsoftware.streams.terminal;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ReductionTerminalOperationsExample {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

        Long count = integers.stream().count();
        System.out.println("Count: " + count);

        Optional<Integer> result;

        result = integers.stream().min((x, y) -> x - y);
        System.out.println("Min: " + result.get());

        result = integers.stream().max(Comparator.comparingInt(x -> x));
        System.out.println("Max: " + result.get());

        Integer reducedValue = integers.stream().reduce(0, (x, y) -> x + y);
        System.out.println("Reduce result: " + reducedValue);

        reducedValue = integers.stream().reduce(0, Integer::sum);
        System.out.println("Other reduce result: " + reducedValue);
    }

}
