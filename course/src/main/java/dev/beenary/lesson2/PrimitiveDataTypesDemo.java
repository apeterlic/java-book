package dev.beenary.lesson2;

public class PrimitiveDataTypesDemo {

    public static void main(String[] args) {
        int number = 5;

        long x = 5;
        //int y = x; // DOES NOT COMPILE

        int y = (int) x; // cast operator

        // float z = 1.5; // DOES NOT COMPILE - missing 'f'
        float z = 1.5f; // OK

        boolean light = true; // means the light is on
        boolean processes = false;

        char c = 'a';
        // char x = b; // DOES NOT COMPILE - it indicates a variable named b somewhere in our code
        // char y = "p"; // DOES NOT COMPILE - we use double quotes for the String data type.
        char a = 65; // 65 is a decimal representation of ‘A’

    }
}
