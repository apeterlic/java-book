package dev.beenary.chapter7;

import java.util.Scanner;

public class EnchantedDoor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the secret word to unlock the door:");
        String magicWord = scanner.nextLine();

        if (magicWord.equals("mellon")) {
            System.out.println("The doors are unlocked. You may enter now.");
        } else {
            System.out.println("The doors remains locked.");
        }
    }
}
