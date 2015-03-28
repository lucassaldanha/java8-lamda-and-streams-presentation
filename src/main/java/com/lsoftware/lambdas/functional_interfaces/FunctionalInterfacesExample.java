package com.lsoftware.lambdas.functional_interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FunctionalInterfacesExample {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);

        integers.forEach(x -> System.out.println(x));


        List<String> words = Arrays.asList("dog", "cat", "mouse");

        Consumer<String> printer = s -> System.out.println(s);

        words.forEach(printer);
    }

}
