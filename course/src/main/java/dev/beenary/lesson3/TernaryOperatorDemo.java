package dev.beenary.lesson3;

public class TernaryOperatorDemo {

    public static void main(String[] args) {
        int y = 10;
        int x = (y == 10) ? 2 : 3;

        String animal = "Dog";
        System.out.println(animal.equals("Dog") ? "Wuf" : false);
    }
}
