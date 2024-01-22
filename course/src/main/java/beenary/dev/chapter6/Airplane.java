package beenary.dev.chapter6;

public class Airplane implements Flyable {

    int wheels;

    double speed;

    String type;

    double capacity;

    @Override
    public void fly() {
        System.out.println("Flying with the speed " + speed);
    }

    // getters and setters


    public int getWheels() {
        return wheels;
    }

    public void setWheels(final int wheels) {
        this.wheels = wheels;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(final double speed) {
        this.speed = speed;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(final double capacity) {
        this.capacity = capacity;
    }


}
