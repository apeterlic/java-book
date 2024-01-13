package beenary.dev.chapter2;

public class Food {

    String name;

    double calories;

    double weight;

    String type;

    public double calculateTotalCalories(){
        return calories * weight;
    }
}
