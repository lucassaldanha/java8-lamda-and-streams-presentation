package com.lsoftware.streams.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MutableReductionTerminalOperationsExample {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

        Set<Integer> s = integers.stream().collect(Collectors.toSet());
        System.out.println("Set: " + s);

        Integer[] a = integers.stream().toArray(Integer[]::new);
        Arrays.stream(a).forEach(System.out::println);
    }

}
