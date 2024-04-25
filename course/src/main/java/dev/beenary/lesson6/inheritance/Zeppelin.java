package dev.beenary.lesson6.inheritance;

public class Zeppelin implements Flyable {

    double speed;

    String type;

    @Override
    public void fly() {
        System.out.println("Floating on the beautiful sky.");
    }
}
