package com.lsoftware.streams.intermediate;

import java.util.Arrays;
import java.util.List;

public class StatefulIntermediateOperations {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 5);

        integers.stream().distinct().forEach(System.out::println);

        integers.stream().limit(3).forEach(System.out::println);

        integers.stream().skip(3).forEach(System.out::println);

        List<Integer> integerList = Arrays.asList(7, 1, 2, 3, 4, 5, 6);
        integerList.stream().sorted().forEach(System.out::print);
    }

}
