package dev.beenary.lesson11;

import java.util.Objects;

public class EqualsHashCodeDemo {

    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        double c = 5.0;
        double d = 5.4;

        System.out.println(a == b); // true
        System.out.println(a == c); // true
        System.out.println(a == d); // false

        String as = "s";
        String bs = "s";
        System.out.println(as == bs);

        Animal2 tiger1 = new Animal2("Diego");
        Animal2 tiger2 = new Animal2("Diego");
        System.out.println(tiger1 == tiger2); // false
        System.out.println(tiger1.equals(tiger2)); // false
    }
}

class Animal2 {
    String name;

    public Animal2(final String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Animal2 animal = (Animal2) o;
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
