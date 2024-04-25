package dev.beenary.lesson7;

public class FinalVariablesDemo {

    public static void main(String[] args) {
        final int x = 1;
        // x = 2; // DOES NOT COMPILE

        final Cat cat = new Cat();
        // cat = new Cat(); // DOES NOT COMPILE

        cat.setName("Fluffy");
        cat.setName("Donna");
    }
}
