package beenary.dev.generics;

public class ToyBoxDemo {

    // Let's see our magical toy box in action
    public static void main(String[] args) {
        // We create a magical toy box that can hold any type of toy
ToyBox<Fruit> toyBox = new ToyBox<>();
toyBox.addToy(new Fruit("banana"));

        // We take out a toy (a string, as we declared the type earlier)

    }
}
