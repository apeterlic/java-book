package dev.beenary.montyhall;

import java.util.Random;
import java.util.Scanner;

public class MontyHallDemoSimplified {

    public static void main(String[] args) {
        System.out.println("Welcome to the Monty Hall Demo!");

        int min = 1;
        int max = 3;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int prizePosition = random.nextInt((max-min)+1) + min;

        System.out.print("Choose a door (1, 2, or 3): ");
        int initialChoice = scanner.nextInt();
        scanner.nextLine();

        int revealedDoor;
        do {
            revealedDoor = random.nextInt((max-min)+1) + min;
        } while (revealedDoor == prizePosition || revealedDoor == initialChoice);

        System.out.printf("You chose the door %d. %n", initialChoice);
        System.out.printf("Behind door %d is a goat. Do you want to stay (S) or switch (SW)?", revealedDoor);

int finalChoice = initialChoice;
String decision;
do {
    System.out.println("Enter the decision");
     decision = scanner.nextLine().toUpperCase();
    if (decision.equals("SW")) {
        do {
            finalChoice = random.nextInt((max - min) + 1) + min;
        } while (finalChoice == initialChoice || finalChoice == revealedDoor);
    }
}while(!decision.equals("SW") && !decision.equals("S"));

        System.out.printf("You chose the door %d. %n", finalChoice);

        if(prizePosition == finalChoice){
            System.out.printf("Behind door %d is a prize. Congratulations!", prizePosition);
        }else {
            System.out.printf("Behind door %d is a goat. Better luck next time.", prizePosition);

        }
        scanner.close();
    }
}

