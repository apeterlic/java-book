package dev.beenary.lesson12.enums_end;

public class FoodDelivery {

    public static void main(String[] args) {
        int totalDelivery = 0;
        Food salad = new Food("Salad");
        salad.order();
        salad.deliver();
        System.out.printf("%s is in status %s%n", salad.getName(), salad.getStatus());

        if (salad.getStatus().equals(FoodStatus.DELIVERED)) {
            totalDelivery++;
        }

        System.out.println("Number of deliveries: " + totalDelivery);

        FoodStatus[] statuses = FoodStatus.values();
        for (FoodStatus status : statuses) {
            System.out.println(status);
        }

        System.out.println(FoodStatus.valueOf("DELIVERED"));
    }
}
