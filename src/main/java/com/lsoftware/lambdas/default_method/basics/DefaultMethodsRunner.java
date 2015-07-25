package com.lsoftware.lambdas.default_method.basics;

public class DefaultMethodsRunner {

    public static void main(String[] args) {
        /*
            TestImpl1
         */
        TestImpl1 testImpl1 = new TestImpl1();
        testImpl1.doSomething();

        /*
            TestImpl2
         */
        TestImpl2 testImpl2 = new TestImpl2();
        testImpl2.doSomething();

        /*
            TestImpl3
         */
        TestImpl3 testImpl3 = new TestImpl3();
        testImpl3.doSomething();
    }

}
