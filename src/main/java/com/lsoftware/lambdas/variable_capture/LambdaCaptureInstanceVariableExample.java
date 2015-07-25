package com.lsoftware.lambdas.variable_capture;

import java.util.Arrays;
import java.util.List;

public class LambdaCaptureInstanceVariableExample {

    private int instanceVar = 10;

//    private final int instanceVar = 10;

    public void doSomething() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

        integers.forEach(x -> {
            instanceVar++;
            System.out.println(instanceVar);
        });
    }

}
