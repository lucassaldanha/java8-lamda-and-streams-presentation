package com.lsoftware.streams.sources;

import java.util.Arrays;
import java.util.List;

public class CollectionStreamExample {

    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Rio de Janeiro", "São Paulo", "Belo Horizonte", "Vitória");
        cities.stream().forEach(System.out::println);
    }

}
