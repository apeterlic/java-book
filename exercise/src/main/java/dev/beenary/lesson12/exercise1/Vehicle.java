package dev.beenary.lesson12.exercise1;

public abstract class Vehicle {

    private String model;

    public Vehicle(String model) {
        this.model = model;
    }

    public abstract VehicleType getVehicleType();

}
