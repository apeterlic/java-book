package dev.beenary.lesson2.variables;

public class Dog {

    public int calculateAge(int humanAge) {
        if (humanAge == 0) {
            int age = 0;
            return age;
        }
        int multiplier = 7;
        int realAge = humanAge * multiplier;
        return realAge;
    }
}
