package dev.beenary.lesson3;

public class BinaryOperatorsDemo {

    public static void main(String[] args) {
        int x = 10;
        int y = 3;
        int sum = x + y; // 13
        int difference = x - y; // 7
        int product = x * y; // 30
        int quotient = x / y; // 3
        int remainder = x % y; // 1

        int a = 5;
        int b = 7;
        boolean isLessThan = (a < b); // true
        boolean isGreaterThan = (a > b); // false

        boolean isEqual = (a == b); // false
        boolean isNotEqual = (a != b); // true

        boolean isJavaFun = true;
        boolean isLearning = true;
        boolean bothAreTrue = isJavaFun && isLearning; // true
        boolean eitherIsTrue = isJavaFun || isLearning; // true
        boolean isNotFun = !isJavaFun; // false

        x = 10;
        y = 5;
        y += 10; // y = y + 10
    }
}
