package com.lsoftware.lambdas.default_method.conflict;

public interface B {

    default void doSomething() {
        System.out.println("B");
    }

}
