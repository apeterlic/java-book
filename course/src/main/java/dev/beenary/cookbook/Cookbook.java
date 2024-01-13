package dev.beenary.cookbook;

public class Cookbook {

    private Recipe[] recipes;

    public Cookbook(final Recipe[] recipes) {
        this.recipes = recipes;
    }

    public Recipe[] getRecipes() {
        return recipes;
    }
}
