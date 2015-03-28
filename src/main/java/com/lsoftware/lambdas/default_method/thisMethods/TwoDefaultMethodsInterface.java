package com.lsoftware.lambdas.default_method.thisMethods;

public interface TwoDefaultMethodsInterface {

    default void methodA() {
        System.out.println("A");
    }

    default void methodB() {
        System.out.println("B");
        this.methodA();
    }

}
