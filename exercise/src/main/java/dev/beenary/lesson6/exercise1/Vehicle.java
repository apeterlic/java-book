package dev.beenary.lesson6.exercise1;

public abstract class Vehicle {

    private String model;

    private int speed;

    public Vehicle(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public abstract String getType();

    public void printInfo() {
        System.out.println("The" + getType() + " model " + this.model + " is driving with speed " + speed);
    }

    public void increaseSpeed() {
        this.speed += this.speed * 0.3;
    }
}
