package dev.beenary.lesson6.polymorphism;

public class Animal {

    protected String name;

    protected String type;

    public Animal(final String name, final String type) {
        this.name = name;
        this.type = type;
    }

    // getters and setters

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }
}
