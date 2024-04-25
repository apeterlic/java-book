package dev.beenary.lesson10;

public class SeriousMath {

    public static void main(String[] args) {
        SeriousMath seriousMath = new SeriousMath();
        seriousMath.divide(10, 2); // result is 5; no surprises here
        seriousMath.divide(10, 0); // ArithmeticException is thrown
    }

    public int divide(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
}
