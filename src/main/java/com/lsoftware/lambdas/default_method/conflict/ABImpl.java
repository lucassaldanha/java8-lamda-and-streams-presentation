package com.lsoftware.lambdas.default_method.conflict;

public class ABImpl implements A, B {

    /*
        When methods collide, you MUST implement your own method
     */
    @Override
    public void doSomething() {
        System.out.println("ABImpl");

        /*
            You can call the specific default implementations if you want
         */
        A.super.doSomething();
        B.super.doSomething();
    }

    public static void main(String[] args) {
        ABImpl abImpl = new ABImpl();

        abImpl.doSomething();
    }
}
