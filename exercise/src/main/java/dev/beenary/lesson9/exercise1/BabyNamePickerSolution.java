package dev.beenary.lesson9.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BabyNamePickerSolution {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Daisy");
        names.add("Trixy");
        names.add("15");
        names.add("Alice");
        pickName(names);
    }

    static void pickName(List<String> names) {
        int randomNumber = new Random().nextInt(names.size() - 1);
        String name = names.get(randomNumber);
        System.out.println("The winner is " + name);
    }
}
