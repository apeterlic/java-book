package dev.beenary.lesson15;

import java.io.IOException;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileVisitorDemo {

    public static void main(String[] args) throws IOException {
        Path directory = Paths.get("directory");
        FileVisitor<Path> visitor = new CustomFileVisitor();
        Files.walkFileTree(directory, visitor);
    }
}
