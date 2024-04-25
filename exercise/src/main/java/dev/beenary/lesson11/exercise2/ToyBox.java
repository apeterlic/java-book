package dev.beenary.lesson11.exercise2;

import java.util.ArrayList;
import java.util.List;

public class ToyBox<T> {
    private List<T> toys = new ArrayList<>();

    // This method lets us put a toy into our magical toy box
    public void addToy(T toy) {
        toys.add(toy);
    }

    // This method lets us take out a toy from our magical toy box
    public T getToy() {
        // We use the magic of generics to say we're returning a toy of the same type we put in
        if (!toys.isEmpty()) {
            return toys.remove(0);
        } else {
            return null; // Oops, the box is empty!
        }
    }
}
