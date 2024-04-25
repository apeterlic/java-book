package dev.beenary.lesson15;

import java.io.File;

/**
 * Contains code samples from lesson 15: Working with Files.
 *
 * @author Ana Peterlić
 */
public class FileDemo {

    public static void main(String[] args) {
        // print file separator:
        System.out.println(System.getProperty("file.separator"));
        System.out.println(File.separator);

        // the File class - exists() method
        File file = new File("test.txt");
        System.out.println(file.exists());

        File fileDemo = new File("file-demo.txt");
        System.out.println(fileDemo.getName());
        System.out.println(fileDemo.getAbsolutePath());
        System.out.println(fileDemo.isFile());
        System.out.println(fileDemo.isDirectory());
        System.out.println(fileDemo.length());
        System.out.println(fileDemo.renameTo(new File("test.txt")));
        System.out.println(fileDemo.getParent());

        File directory = new File("test");
        System.out.println(directory.mkdir());
        File[] files = directory.listFiles();
        for (File f : files) {
            System.out.println(f.getName());
        }

        File directories = new File("directory/test");
        System.out.println(directories.mkdirs());

    }
}
