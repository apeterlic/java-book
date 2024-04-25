package dev.beenary.lesson3;

public class UnaryOperatorsDemo {

    public static void main(String[] args) {
        int x = 5;
        int y = --x * 2 / x++ + --x;
        System.out.println("x is " + x);
        System.out.println("y is " + y);
    }
}
