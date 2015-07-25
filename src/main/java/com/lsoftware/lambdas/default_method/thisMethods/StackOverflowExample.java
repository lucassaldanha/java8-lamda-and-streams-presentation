package com.lsoftware.lambdas.default_method.thisMethods;

public class StackOverflowExample implements StackOverflowInterface {

    public static void main(String[] args) {
        StackOverflowExample soEx = new StackOverflowExample();
        soEx.method1();
    }

}
