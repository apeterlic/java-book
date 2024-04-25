package dev.beenary.lesson13.static_class;

public class Food {

    private String name;

    private double calories;

    private String status = "";

    public Food(String name, double calories) {
        this.name = name;
        this.calories = calories;
    }

    public void order() {
        this.status = "ORDERED";
        System.out.println("The food is ordered.");
    }

    public void prepare() {
        this.status = "PREPARED";
        System.out.println("The food is prepared.");
        notifyDelivery();
    }

    private void notifyDelivery() {
        DeliveryNotifier deliveryNotifier = new DeliveryNotifier("+356689789899", status);
        deliveryNotifier.sendSms();
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(final double calories) {
        this.calories = calories;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    public static class DeliveryNotifier {
        private String contact;

        private String status;

        public DeliveryNotifier(String contact, String status) {
            this.contact = contact;
            this.status = status;
        }

        public void sendSms() {
            if (status.equals("PREPARED")) {
                System.out.println("Sending SMS to " + contact);
            } else {
                System.out.println("The food is not ready yet.");
            }
        }
    }

}
