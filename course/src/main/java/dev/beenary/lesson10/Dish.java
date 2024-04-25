package dev.beenary.lesson10;

public class Dish {
    private int cookingTime;

    public Dish(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    public void prepare() {
        if (cookingTime > 30) {
            throw new OvercookedException("Food is overcooked.");
        }
    }

    public void grade(boolean missingIngredient, boolean enoughSeasoning) throws MissingIngredientException {
        if (missingIngredient) {
            throw new MissingIngredientException("Some ingredients are missing.");
        }

        if (!enoughSeasoning) {
            throw new MissingSeasoningException("Food is not seasoned enough.");
        }
    }
}
