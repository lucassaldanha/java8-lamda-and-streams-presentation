package com.lsoftware.streams.sources;

public class CharacterStreamExample {

    public static void main(String[] args) {
        long charsCount = "ABC".chars().count();
        System.out.println(charsCount);
    }

}
