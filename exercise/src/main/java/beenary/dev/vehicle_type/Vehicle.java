package beenary.dev.vehicle_type;

public abstract class Vehicle {

    private String model;

    public Vehicle(final String model) {
        this.model = model;
    }

    public abstract VehicleType getType();

}
