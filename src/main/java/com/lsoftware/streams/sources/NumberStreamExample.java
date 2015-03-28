package com.lsoftware.streams.sources;

import java.util.stream.LongStream;

public class NumberStreamExample {

    public static void main(String[] args) {
        LongStream.range(0, 5).forEach(System.out::println);
    }

}
