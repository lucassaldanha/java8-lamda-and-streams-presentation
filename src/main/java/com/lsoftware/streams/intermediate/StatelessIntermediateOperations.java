package com.lsoftware.streams.intermediate;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StatelessIntermediateOperations {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

        integers.stream().filter(x -> x > 4).forEach(System.out::println);

        List<Integer> m = integers.stream().map(x -> x + 1).collect(Collectors.toList());
        m.forEach(System.out::println);

        IntSummaryStatistics stats = integers.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println(stats);
    }

}
