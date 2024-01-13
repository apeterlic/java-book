package beenary.dev.generics;

public class Car implements Toy {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}