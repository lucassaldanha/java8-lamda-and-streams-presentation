package com.lsoftware.lambdas.variable_capture;

import java.util.Arrays;
import java.util.List;

public class LambdaCaptureThisExample {

    private static final LambdaCaptureThisExample INSTANCE = new LambdaCaptureThisExample();

    private int var = 1;

    private List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

    public void doSomething() {
        integers.forEach(x -> {
            System.out.println(x + this.var);

            if(this == INSTANCE) {
                System.out.println("Whow! The this references the this of the enclosing object!");
            }
        });
    }

    public static void main(String[] args) {
        INSTANCE.doSomething();
    }

}
