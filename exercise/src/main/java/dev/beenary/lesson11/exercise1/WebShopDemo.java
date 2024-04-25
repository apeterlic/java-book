package dev.beenary.lesson11.exercise1;

public class WebShopDemo {

    public static void main(String[] args) {
        Item lettuce = new Item("lettuce", 0.34);
        Item tv = new Item("TV", 300.99);
        Item plant = new Item("plant", 10);
        Item keyboard = new Item("keyboard", 100);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(lettuce);
        shoppingCart.addItem(tv);
        shoppingCart.addItem(plant);
        shoppingCart.addItem(keyboard);
        shoppingCart.removeItem(plant);
        shoppingCart.checkout();
    }
}
