package dev.beenary.lesson7;

public class CoffeeMaker {

    public static void main(String[] args) {

        CoffeeMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.roastBeans();

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    private void roastBeans() {
        int numberOfRoastedBeans = 0;

        for (int i = 1; i <= 100; i++) {
            numberOfRoastedBeans++;
        }

        System.out.println("Number of roasted coffee beans " + numberOfRoastedBeans);

    }
}
