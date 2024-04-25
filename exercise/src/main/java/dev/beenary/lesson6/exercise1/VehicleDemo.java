package dev.beenary.lesson6.exercise1;

public class VehicleDemo {

    public static void main(String[] args) {
        Vehicle car = new Car("Mercedes", 10);
        Vehicle truck = new Truck("Toshiba", 100);
        System.out.println(car.getType()); // prints CAR
        System.out.println(truck.getType()); // prints MOTORCYCLE
        car.increaseSpeed();
        truck.increaseSpeed();
        car.printInfo();
        truck.printInfo();
    }
}
