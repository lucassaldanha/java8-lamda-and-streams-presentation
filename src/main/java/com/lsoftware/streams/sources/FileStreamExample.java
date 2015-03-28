package com.lsoftware.streams.sources;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileStreamExample {

    public static void main(String[] args) throws IOException {
        String userDir = System.getProperty("user.dir");
        Path workingDirectory = FileSystems.getDefault().getPath(userDir);

        System.out.println("Directory listing stream");
        Files.list(workingDirectory).forEach(System.out::println);

        System.out.println("Depth first walking stream");
        Files.walk(workingDirectory).forEach(System.out::println);
    }

}
