package dev.beenary.lesson13.static_class;

public class FoodDeliveryDemo {

    public static void main(String[] args) {
        Food sushi = new Food("sushi", 300);
        sushi.order();
        sushi.prepare();

        Food.DeliveryNotifier deliveryNotifier = new Food.DeliveryNotifier("+234567890", sushi.getStatus());
        deliveryNotifier.sendSms();
    }
}
