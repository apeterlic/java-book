package dev.beenary.lesson5.exercise1;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text:");
        String s = scanner.nextLine();

        System.out.println("Uppercase version: " + s.toUpperCase());
        System.out.println("Length: " + s.length());
    }
}
