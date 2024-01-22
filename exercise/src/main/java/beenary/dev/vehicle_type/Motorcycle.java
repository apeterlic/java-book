package beenary.dev.vehicle_type;

public class Motorcycle extends Vehicle {

    public Motorcycle(final String model) {
        super(model);
    }

    @Override
    public VehicleType getType() {
        return VehicleType.MOTORCYCLE;
    }
}
