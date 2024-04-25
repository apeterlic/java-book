package dev.beenary.lesson2.exercise2;

public class Library {
    public int totalBooksAmount = 10;

    public void checkOutBook() {
        totalBooksAmount = totalBooksAmount - 1;
    }

    public int getTotalBooksNumber() {
        return totalBooksAmount;
    }

    public void returnBook() {
        totalBooksAmount = totalBooksAmount + 1;
    }
}