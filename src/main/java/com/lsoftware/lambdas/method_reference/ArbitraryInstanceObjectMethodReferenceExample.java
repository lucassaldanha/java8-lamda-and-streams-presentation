package com.lsoftware.lambdas.method_reference;

import java.util.function.Function;

public class ArbitraryInstanceObjectMethodReferenceExample {

    public static void main(String[] args) {
        Function<String, String> mapper1 = x -> x.toUpperCase();
        System.out.println(mapper1.apply("abc"));

        Function<String, String> mapper2 = String::toUpperCase;
        System.out.println(mapper2.apply("def"));
    }
}
