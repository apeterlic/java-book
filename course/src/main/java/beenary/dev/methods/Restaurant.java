package beenary.dev.methods;

/**
 * Chapter: Class Members - Methods. Alice’s Restaurant.
 *
 * @author Ana Peterlić
 */
public class Restaurant {

    /**
     * Calculates calories intake for certain food.
     *
     * @param calories
     *         :: calories per gram.
     * @param weight
     *         :: total weight of food.
     * @return result :: total calories.
     */
public double calculateCalories(double calories, double weight) {
    return calories * weight;
}
}
