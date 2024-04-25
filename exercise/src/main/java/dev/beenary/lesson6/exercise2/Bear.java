package dev.beenary.lesson6.exercise2;

import java.util.Scanner;

public class Bear extends Animal {
    private boolean hibernation;

    public Bear(final String name, final String type) {
        super(name, type);
    }

    public Bear(String name, String type, boolean hibernation) {
        super(name, type);
        this.hibernation = hibernation;
        Scanner scanner = new Scanner(System.in);
        scanner.nextDouble();
    }

    // getters and setters

    public boolean isHibernation() {
        return hibernation;
    }

    public void setHibernation(final boolean hibernation) {
        this.hibernation = hibernation;
    }
}
