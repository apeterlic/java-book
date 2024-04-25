package dev.beenary.lesson6.polymorphism;

import dev.beenary.lesson6.inheritance.Flyable;

public class PolymorphismDemo {

    public static void main(String[] args) {
        Bird bird = new Bird("Tweety", "Canarian", 5);

        Flyable flyable = bird;
        flyable.fly();

        Animal animal = bird;
        System.out.println(animal.getName());

        System.out.println("RAZV".equalsIgnoreCase(null));
    }
}
