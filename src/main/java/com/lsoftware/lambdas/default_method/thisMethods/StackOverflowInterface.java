package com.lsoftware.lambdas.default_method.thisMethods;

public interface StackOverflowInterface {

    default void method1() {
        System.out.println("This is the method1");

        this.method2();
    }

    default void method2() {
        System.out.println("This is the method2");

        this.method1();
    }

}
