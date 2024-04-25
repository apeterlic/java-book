package dev.beenary.lesson9;

public class PairDouble {
    private Double first;
    private Double second;

    public PairDouble(final Double first, final Double second) {
        this.first = first;
        this.second = second;
    }

    public Double add() {
        return first + second;
    }
}
