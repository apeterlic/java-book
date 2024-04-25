package dev.beenary.lesson2;

public class Square {
    private double side;

    public Square(final double side) {
        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(final double side) {
        this.side = side;
    }
}