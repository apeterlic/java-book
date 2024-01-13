package beenary.dev.collections;

import java.util.Set;

public class PokemonDemo {

    public static void main(String[] args) {

        PokemonTrainer pokemonTrainer = new PokemonTrainer("Ash", "Katchum");

        // the add() method
        Pokemon bellsprout = new Pokemon("Bellsprout", "Grass", 1);
        pokemonTrainer.addPokemon(bellsprout);

        // the get() method
        System.out.println(pokemonTrainer.getPokemon(0));

        // the add() method
        Pokemon pidgeot = new Pokemon("Pidgeot", "Flying", 1);
        pokemonTrainer.addPokemon(pidgeot);

        // the indexOf() method
        System.out.println(pokemonTrainer.getPokemonIndex(pidgeot));

        // the set() method
        Pokemon pikachu = new Pokemon("Pikachu", "Electric", 1);
        pokemonTrainer.switchPokemon(1, pikachu);

        // the remove() method
        pokemonTrainer.removePokemon(pikachu);


Pokemon pikachu1 = new Pokemon("Pikachu", "Electric", 1);
Pokemon pikachu2 = new Pokemon("Pikachu", "Electric", 1);
System.out.println(pikachu1.equals(pikachu2));


        System.out.println("+---------+");
        System.out.println("|         |");
        System.out.println("+---------+");
    }
}
