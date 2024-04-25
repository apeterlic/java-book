package dev.beenary.lesson5;

public class MathDemo {

    public static void main(String[] args) {
        System.out.println(Math.abs(-1)); // 1
        System.out.println(Math.cbrt(125)); // 5
        System.out.println(Math.pow(4, 2)); // 16
        System.out.println(Math.sqrt(16)); // 4
        System.out.println(Math.max(16, 4)); // 16
        System.out.println(Math.min(16, 4)); // 4

        double random = Math.random();
        System.out.println(random);

        System.out.println(Math.exp(1)); // 2.718281828459045
        System.out.println(Math.log(Math.E)); // 1
        System.out.println(Math.log10(10)); // 1
        System.out.println(Math.ceil(3.14)); // 4
        System.out.println(Math.ceil(3.14)); // 3
    }
}
