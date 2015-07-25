package com.lsoftware.lambdas.variable_capture;

import java.util.Arrays;
import java.util.List;

public class LambdaCaptureStaticVariableExample {

    private static int staticVar = 10;

//    private static final int staticVar = 10;

    public void doSomething() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

        integers.forEach(x -> {
            staticVar++;
            System.out.println(staticVar);
        });
    }

}
