package dev.beenary.lesson8;

public class TransportDemo {

    public static void main(String[] args) {
        Animal tiger = new Animal("Pepy", "Tiger", 2);
        Animal elephant = new Animal("Sasha", "Elephant", 5);
        Animal parrot = new Animal("Poly", "parrot", 13);
        Animal koala = new Animal("Nigel", "koala", 7);
        Animal giraffe = new Animal("Marty", "giraffe", 3);
        Animal kameleon = new Animal("Pascal", "kameleon", 1);
        Animal sloth = new Animal("Timmy", "sloth", 4);

        // transport the animals
        Truck truck = new Truck(7);
        truck.addAnimal(tiger);
        truck.addAnimal(elephant);
        truck.addAnimal(parrot);
        truck.addAnimal(koala);
        truck.addAnimal(giraffe);
        truck.addAnimal(kameleon);
        truck.addAnimal(sloth);
    }
}
