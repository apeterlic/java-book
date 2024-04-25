package dev.beenary.lesson6.exercise2;

public class Cat extends Animal {

    private String color;

    public Cat(String name, String type, String color) {
        super(name, type);
        this.color = color;
    }

    // getters and setters

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }
}
