package dev.beenary.lesson6.exercise2;

public class AnimalDemo {

    public static void main(String[] args) {
        Animal animal = new Bear("Baloo", "Grizzly", true);
        Monkey bear = (Monkey) animal;
        System.out.println(bear.getName());

    }
}
