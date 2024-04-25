package dev.beenary.lesson11.exercise2;

public class Doll implements Toy {

    private String name;

    public Doll(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
