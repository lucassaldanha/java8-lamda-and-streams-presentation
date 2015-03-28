package com.lsoftware.lambdas.default_method.basics;

public class TestImpl2 implements Test {

    @Override public void doSomething() {
        System.out.println("TestImpl2");
    }

    public static void main(String[] args) {
        TestImpl2 testImpl2 = new TestImpl2();
        testImpl2.doSomething();
    }

}
