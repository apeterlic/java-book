package dev.beenary.lesson4;

import java.util.Scanner;

public class CatManager {

    public static void main(String[] args) {
        // Cat cat = new Cat("Fluffy", "Persian", 23);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name:");
        String name = scanner.nextLine();

        System.out.println("Enter the type:");
        String type = scanner.nextLine();

        System.out.println("Enter the age:");
        int age = scanner.nextInt();

        Cat myCat = new Cat(name, type, age);
    }
}
