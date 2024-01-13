package beenary.dev.chapter2;

import java.util.Date;

public class Cat {

    String name;

    String type;

    int age;

    Date dateOfBirth;

    public Cat(final String name, final String type, final int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    public void sleep() {
        System.out.println("ZzzzZzz");
    }

    public void eat() {
        System.out.println("I'm eating.");
    }

    public void makeSound() {
        System.out.println("Meow.");
    }
}
