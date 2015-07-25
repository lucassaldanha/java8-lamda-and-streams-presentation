package com.lsoftware.lambdas.default_method.basics;

public class TestImpl2 implements Test {

    @Override public void doSomething() {
        System.out.println(identifier() + "TestImpl2 override");
    }

}
