package dev.beenary.lesson4.exercise1;

import java.util.Scanner;

/**
 * Understanding Objects - Exercise 1
 */
public class MathDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        double first = scanner.nextDouble();

        System.out.println("Enter second number:");
        double second = scanner.nextDouble();

        double result = first / second;
        System.out.printf("Division result: %.2f%n", result);

        System.out.println("Enter first number to swap:");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second number to swap:");
        int secondNumber = scanner.nextInt();

        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;

        System.out.printf("Numbers are swapped: %d %d", firstNumber, secondNumber);
    }

}
