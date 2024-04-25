package dev.beenary.lesson8;

public class Truck {
    String registration;
    int capacity;
    Animal[] animals;
    int animalIndex = 0;

    public Truck(int capacity) {
        animals = new Animal[capacity];
    }

    public void addAnimal(Animal animal) {
        animals[animalIndex] = animal;
        animalIndex++;
    }
}


