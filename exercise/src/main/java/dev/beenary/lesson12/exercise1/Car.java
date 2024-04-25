package dev.beenary.lesson12.exercise1;

public class Car extends Vehicle {

    public Car(String model) {
        super(model);
    }

    @Override
    public VehicleType getVehicleType() {
        return VehicleType.CAR;
    }
}