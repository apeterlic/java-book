package dev.beenary.lesson9;

public class PairInteger {

    private Integer first;
    private Integer second;

    public PairInteger(final Integer first, final Integer second) {
        this.first = first;
        this.second = second;
    }

    public Integer add() {
        return first + second;
    }
}
