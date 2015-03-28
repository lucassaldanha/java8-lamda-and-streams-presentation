package com.lsoftware.streams;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class WhatDoesThisProgramDoes {

    public static void main(String[] args) throws IOException {
        String workingDirectory = System.getProperty("user.dir");
        Path workingPath = FileSystems.getDefault().getPath(workingDirectory);

        String classFileName = WhatDoesThisProgramDoes.class.getName().replace(".", "/") + ".java";

        int maxDepth = 10;

        Files.find(workingPath, maxDepth, (filename, attributes) -> filename.endsWith(classFileName))
                .forEach(path -> {
                    try {
                        Files.lines(path).forEach(System.out::println);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
    }

}
