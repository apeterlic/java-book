package dev.beenary.lesson6.exercise1;

public class Car extends Vehicle {

    public Car(String model, int speed) {
        super(model, speed);
    }

    @Override
    public String getType() {
        return "car";
    }
}
