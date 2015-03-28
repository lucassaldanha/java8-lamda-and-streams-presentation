package com.lsoftware.lambdas.default_method.conflict;

public interface A {

    default void doSomething() {
        System.out.println("A");
    }

}
