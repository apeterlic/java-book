package dev.beenary.lesson7;

import java.util.Scanner;

public class DoWhileDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;

        do {
            System.out.println("Enter the number between 1 and 5:");
            number = scanner.nextInt();
            scanner.nextLine();
        } while (number < 1 || number > 5);
    }
}
