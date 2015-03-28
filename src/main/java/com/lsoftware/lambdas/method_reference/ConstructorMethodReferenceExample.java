package com.lsoftware.lambdas.method_reference;

import java.util.function.Function;

public class ConstructorMethodReferenceExample {

    public static void main(String[] args) {
        Function<String, Integer> mapper1 = x -> new Integer(x);
        System.out.println(mapper1.apply("1"));

        Function<String, Integer> mapper2 = Integer::new;
        System.out.println(mapper2.apply("2"));
    }
}
