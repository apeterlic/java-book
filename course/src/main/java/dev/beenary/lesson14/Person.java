package dev.beenary.lesson14;

public class Person {

    private String firstName;

    public Person(final String firstName) {
        this.firstName = firstName;
    }

    public static void main(String[] args) {
        Person p = new Person("Tom");

        System.out.println(p.checkEquality(
                new StringChecker() {
                    @Override
                    public boolean check(final String s) {
                        return s.equals("Peter");
                    }
                }));

        p.checkEquality((String s) -> s.equals("Peter"));

    }

    // getters and setters

    public boolean checkEquality(StringChecker checker) {
        return checker.check(firstName);
    }

    // getters and setters
}
