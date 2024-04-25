package dev.beenary.lesson11;

import java.util.ArrayList;
import java.util.List;

public class PokemonTrainer {

    private String firstName;

    private String lastName;

    private List<Pokemon> pokedex = new ArrayList<>();

    public PokemonTrainer(final String firstName, final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void addPokemon(Pokemon pokemon) {
        pokedex.add(pokemon);
    }

    public Pokemon getPokemon(int index) {
        return pokedex.get(index);
    }

    public int getPokemonIndex(Pokemon pokemon) {
        return pokedex.indexOf(pokemon);
    }

    public void switchPokemon(int oldPokemonIndex, Pokemon newPokemon) {
        pokedex.set(oldPokemonIndex, newPokemon);
    }

    public int getPokedexSize() {
        return pokedex.size();
    }

    public boolean isPokedexEmpty() {
        return pokedex.isEmpty();
    }

    public void removePokemon(Pokemon pokemon) {
        pokedex.remove(pokemon);
    }
}
