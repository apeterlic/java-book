package dev.beenary.lesson13.inner;

public class FoodDeliveryDemo {

    public static void main(String[] args) {
        Food sushi = new Food("sushi", 300);
        sushi.order();
        sushi.prepare();

        Food.DeliveryNotifierInner deliveryNotifier = sushi.new DeliveryNotifierInner("+234567890");
        deliveryNotifier.sendSms();
    }
}
