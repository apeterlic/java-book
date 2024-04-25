package dev.beenary.lesson7.exercise2;

import java.util.Random;
import java.util.Scanner;

public class MontyHallDemo {

    public static void main(String[] args) {
        System.out.println("Welcome to the Monty Hall Demo!");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int prizePosition = random.nextInt(3);

        // Get the initial choice from the user
        int initialChoice;
        do {
            System.out.print("Choose a door (1, 2, or 3): ");
            initialChoice = scanner.nextInt();
            scanner.nextLine();
        } while (initialChoice < 1 || initialChoice > 3);

        // Host reveals a door with a goat
        int revealedDoor;
        do {
            revealedDoor = random.nextInt(3);
        } while (revealedDoor == prizePosition || revealedDoor == initialChoice);

        // Ask the contestant if they want to stay or switch
        System.out.println(
                "You chose door " + (initialChoice + 1) + ". Behind door " + (revealedDoor + 1) + " is a goat. Do you want to stay (S) or switch (SW)?");
        String decision = scanner.nextLine().toUpperCase();

        // Determine the final result based on the contestant's decision
        int finalChoice = 0;
        if (decision.equals("S")) {
            finalChoice = initialChoice;
        } else if (decision.equals("SW")) {
            do {
                finalChoice = random.nextInt(3);
            } while (finalChoice == initialChoice || finalChoice == revealedDoor);
        } else {
            System.out.println("Invalid decision. Exiting the program.");
            System.exit(0);
        }

        // Display the final result
        System.out.println("You chose door " + (finalChoice + 1) + ". Behind door " + (prizePosition + 1) + " is " + (
                prizePosition == finalChoice
                        ? "a car! Congratulations!"
                        : "a goat. Better luck next time."));

        // Close the scanner
        scanner.close();
    }
}

