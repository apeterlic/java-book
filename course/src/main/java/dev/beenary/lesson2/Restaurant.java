package dev.beenary.lesson2;

/**
 * Lesson 2: Class Members - Methods. Alice’s Restaurant.
 *
 * @author Ana Peterlić
 */
public class Restaurant {

    public static void main(String[] args) {
        double salad = calculateCalories(15.45, 500.32);
        System.out.println("Caloric intake: " + salad);
        double hamburger = calculateCalories(409.47, 200.00);
        System.out.println("Caloric intake: " + hamburger);
    }

    public static double calculateCalories(double calories, double weight) {
        return calories * weight;
    }
}
