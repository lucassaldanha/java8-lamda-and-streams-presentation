package com.lsoftware.lambdas.default_method.basics;

public interface Test {

    default void doSomething() {
        System.out.println("Test");
    }

}
