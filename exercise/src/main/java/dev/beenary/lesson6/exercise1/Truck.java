package dev.beenary.lesson6.exercise1;

public class Truck extends Vehicle {

    public Truck(String model, int speed) {
        super(model, speed);
    }

    @Override
    public String getType() {
        return "truck";
    }
}
