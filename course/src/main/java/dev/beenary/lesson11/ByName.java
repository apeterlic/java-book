package dev.beenary.lesson11;

import java.util.Comparator;

public class ByName implements Comparator<Animal> {
    @Override
    public int compare(final Animal o1, final Animal o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
