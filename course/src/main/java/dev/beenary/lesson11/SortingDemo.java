package dev.beenary.lesson11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingDemo {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("VeryLongAnimalName", "Koala"));
        animals.add(new Animal("Short", "Giraffe"));
        animals.add(new Animal("A", "Zebra"));
        animals.add(new Animal("MiddleLengthName", "Cat"));

        Collections.sort(animals, new ByName());

        Collections.sort(animals);
        System.out.println(animals);
    }
}
