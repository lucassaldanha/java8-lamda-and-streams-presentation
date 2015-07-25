package com.lsoftware.lambdas.default_method.basics;

public interface TestExtension extends Test {

    default void doSomething() {
        System.out.println(identifier() + "Test Extension");
    }

}
