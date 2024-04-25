package dev.beenary.lesson7;

public class Cat {

    private String name;

    public final void makeSound() {
        System.out.println("Meow");
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
