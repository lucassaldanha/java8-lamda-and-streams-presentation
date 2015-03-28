package com.lsoftware.lambdas.method_reference;

import java.util.function.Consumer;

public class StaticMethodReferenceExample {

    public static void doSomething(Integer i) {
        System.out.println(i);
    }

    public static void main(String[] args) {
        Consumer<Integer> consumer1 = i -> doSomething(i);
        consumer1.accept(1);

        Consumer<Integer> consumer2 = StaticMethodReferenceExample::doSomething;
        consumer2.accept(2);
    }

}
