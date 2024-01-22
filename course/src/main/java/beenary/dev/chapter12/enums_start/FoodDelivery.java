package beenary.dev.chapter12.enums_start;

public class FoodDelivery {

    public static void main(String[] args) {
        int totalDelivery = 0;
        Food salad = new Food("Salad");
        salad.order();
        salad.deliver();
        System.out.printf("%s is in status %s%n", salad.getName(), salad.getStatus());

        if (salad.getStatus().equals("delivered")) {
            totalDelivery++;
        }

        System.out.println("Number of deliveries: " + totalDelivery);
    }
}
