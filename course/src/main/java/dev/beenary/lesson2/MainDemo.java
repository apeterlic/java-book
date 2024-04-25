package dev.beenary.lesson2;

public class MainDemo {

    public static void main(String[] args) {
        System.out.println("Hello");

        String text = "(for cat lovers only)";
        System.out.printf("Hello, %s.", text); // prints: Hello, (for cat lovers only).

        System.out.printf("Number of processors is %d.", 4); // prints: Number of processors is 4.
        System.out.printf("My height is %.2f cm.", 170.5); // prints: My height is 170.50 cm.
    }
}
