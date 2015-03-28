package com.lsoftware.lambdas.variable_capture;

import java.util.Arrays;
import java.util.List;

public class LambdaCaptureExample {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

        int var = 10;

        integers.forEach(x -> {
            x += var;
            System.out.println(x);
        });
    }

}
