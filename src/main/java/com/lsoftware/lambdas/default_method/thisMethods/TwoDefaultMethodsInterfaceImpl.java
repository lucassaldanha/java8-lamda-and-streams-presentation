package com.lsoftware.lambdas.default_method.thisMethods;

public class TwoDefaultMethodsInterfaceImpl implements TwoDefaultMethodsInterface {

    public static void main(String[] args) {
        TwoDefaultMethodsInterface t = new TwoDefaultMethodsInterfaceImpl();

        t.methodA();

        t.methodB();
    }

}
