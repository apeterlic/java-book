package dev.beenary.lesson11.exercise1;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items;

    private double totalPrice;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void checkout() {
        totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getPrice();
        }
        System.out.println("Total amount to pay: " + totalPrice);
    }
}
