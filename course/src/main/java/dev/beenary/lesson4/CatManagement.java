package dev.beenary.lesson4;

public class CatManagement {

    public static void main(String[] args) {

        Cat c1 = new Cat("Fluffy", "Persian", 3);

        Cat c2 = new Cat("Mimmy", "Siamese", 4);

        Cat c3 = new Cat("Cleo", "Sphynx", 1);

        c1 = null;

        c2 = c3;
    }
}
