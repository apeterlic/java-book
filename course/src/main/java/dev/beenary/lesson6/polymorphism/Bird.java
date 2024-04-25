package dev.beenary.lesson6.polymorphism;

import dev.beenary.lesson6.inheritance.Flyable;

public class Bird extends Animal implements Flyable {

    public int size;

    public Bird(String name, String type, int size) {
        super(name, type);
        this.size = size;
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }

    // getters and setters

    public int getSize() {
        return size;
    }

    public void setSize(final int size) {
        this.size = size;
    }
}
