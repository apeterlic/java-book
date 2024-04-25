package dev.beenary.lesson12.exercise1;

public class VehicleDemo {

    public static void main(String[] args) {
        Vehicle car = new Car("Mercedes");
        Vehicle truck = new Motorcycle("Toshiba");
        System.out.println(car.getVehicleType()); // prints CAR
        System.out.println(truck.getVehicleType()); // prints MOTORCYCLE
    }
}
