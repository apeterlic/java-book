package dev.beenary.lesson7;

public class ContinueDemo {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            sum += 1;
        }
        System.out.println(sum); // 9
    }
}
