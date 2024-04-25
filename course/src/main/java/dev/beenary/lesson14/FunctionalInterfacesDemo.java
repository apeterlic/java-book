package dev.beenary.lesson14;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfacesDemo {

    public static void main(String[] args) {
        // the Function interface
        Function<String, Integer> length = s -> s.length();
        System.out.println(length.apply("Tom"));

        // the Supplier interface
        Supplier<Double> generatedNumber = () -> {
            Random random = new Random();
            return random.nextDouble();
        };
        System.out.println(generatedNumber.get());

        // the Consumer interface
        Consumer<String> printable = s -> System.out.println(s);
        printable.accept("This is cool.");

        // the Predicate interface
        Predicate<String> checkLength = s -> s.length() == 5;
        boolean b = checkLength.test("Animal");
    }
}
