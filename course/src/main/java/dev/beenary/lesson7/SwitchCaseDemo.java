package dev.beenary.lesson7;

import java.util.Scanner;

public class SwitchCaseDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the secret word to unlock the door:");
        String magicWord = scanner.nextLine();

        switch (magicWord) {
            case "mellon":
                System.out.println("The doors are unlocked. You may enter now.");
            case "melon":
                System.out.println("Almost there.");
            default:
                System.out.println("The doors remains locked.");
        }

        getWeekDay("Sunday");
    }

    public static void getWeekDay(String day) {
        int value = switch (day) {
            case "Saturday":
                yield 1;
            case "Sunday":
                yield 2;
            default:
                yield 0;
        };
        System.out.println(value);
    }

}
