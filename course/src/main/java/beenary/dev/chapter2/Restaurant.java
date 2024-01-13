package beenary.dev.chapter2;

public class Restaurant {

    public static void main(String[] args) {
        double food1 = calculateCalories(15.45, 500.32);
        double food2 = calculateCalories(409.47, 200.00);
    }

    public static double calculateCalories(double calories, double weight) {
        return calories * weight;
    }
}
