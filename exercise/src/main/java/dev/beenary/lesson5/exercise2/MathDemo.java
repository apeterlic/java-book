package dev.beenary.lesson5.exercise2;

import java.util.Scanner;

public class MathDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        double first = scanner.nextDouble();

        System.out.println("Enter second number:");
        double second = scanner.nextDouble();

        double result = first + second;
        System.out.printf("Sum result: %.2f%n", result);

        System.out.printf("Max value: %.2f%n", Math.max(first, second));

        System.out.println("Enter third number:");
        double third = scanner.nextDouble();

        System.out.printf("Avg value: %.2f%n", (result + third) / 3);

    }
}
