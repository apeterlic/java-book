package beenary.dev;

public class CoffeeMaker {

    public static void main(String[] args) {

        CoffeeMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.roastBeans();
    }

    private  void roastBeans() {
        int numberOfRoastedBeans = 0;

for(int i = 1; i <= 100; i++){
    numberOfRoastedBeans++;
}

        System.out.println("Number of roasted coffee beans " + numberOfRoastedBeans);

    }
}
