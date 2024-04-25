package dev.beenary.lesson11.exercise2;

public class Car implements Toy {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}