package dev.beenary.lesson12.exercise1;

public class Motorcycle extends Vehicle {

    public Motorcycle(String model) {
        super(model);
    }

    @Override
    public VehicleType getVehicleType() {
        return VehicleType.MOTORCYCLE;
    }
}
