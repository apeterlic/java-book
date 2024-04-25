package dev.beenary.lesson11;

import java.util.ArrayList;
import java.util.List;

public class ToyBox {

    private List<String> toys = new ArrayList<>();

    public void addToy(String toy) {
        toys.add(toy);
    }

    public void removeToy(String toy) {
        toys.remove(toy);
    }

    public int getNumberOfToys() {
        return toys.size();
    }

}
