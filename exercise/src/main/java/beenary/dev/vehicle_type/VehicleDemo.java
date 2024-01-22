package beenary.dev.vehicle_type;

public class VehicleDemo {

    public static void main(String[] args) {
        Vehicle car = new Car("Mercedes");
        Vehicle motorcycle = new Motorcycle("Toshiba");
        System.out.println(car.getType()); // prints CAR
        System.out.println(motorcycle.getType()); // prints MOTORCYCLE
    }
}
