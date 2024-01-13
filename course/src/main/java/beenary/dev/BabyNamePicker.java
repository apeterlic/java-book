package beenary.dev;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BabyNamePicker {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Peter");
        names.add("Mark");
        //names.add(15);
        names.add("Ian");
        pickName(names);
    }

    static void pickName(List<String> names) {
        int randomNumber = new Random().nextInt(names.size() - 1);
        String name = names.get(randomNumber);
        System.out.println("The winner is " + name);
    }
}
