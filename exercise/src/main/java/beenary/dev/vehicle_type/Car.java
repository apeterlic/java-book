package beenary.dev.vehicle_type;

public class Car extends Vehicle {

    public Car(final String model) {
        super(model);
    }

    @Override
    public VehicleType getType() {
        return VehicleType.CAR;
    }
}
