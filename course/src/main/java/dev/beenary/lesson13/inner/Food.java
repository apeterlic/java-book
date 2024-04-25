package dev.beenary.lesson13.inner;

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
        DeliveryNotifierInner deliveryNotifier = new DeliveryNotifierInner("+34567890");
        deliveryNotifier.sendSms();
    }

    public class DeliveryNotifierInner {
        private String contact;

        public DeliveryNotifierInner(String contact) {
            this.contact = contact;
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
