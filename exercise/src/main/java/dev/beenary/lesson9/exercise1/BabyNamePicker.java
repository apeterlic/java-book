package dev.beenary.lesson9.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BabyNamePicker {
    public static void main(String[] args) {
        List names = new ArrayList<>(); // Create collection and add some elements in it
        names.add("Daisy");
        names.add("Trixy");
        names.add(11); // This was Bob's idea.
        names.add("Alice");
        pickName(names);
    }

    static void pickName(List names) {
        int randomNumber = new Random().nextInt(names.size() - 1);
        String name = (String) names.get(randomNumber); // Pick a random name.
        System.out.println("The winner is " + name); // Print the name.
    }
}
