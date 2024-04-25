package dev.beenary.lesson5;

public class StringDemo {

    public static void main(String[] args) {
        // concatenation
        String a = "bee";
        String b = "nary";
        String c = a + b;
        System.out.println(c);

        System.out.println(1 + 2); // 3
        System.out.println("a" + "b"); // ab
        System.out.println(1 + 2 + "c"); // 3c
        System.out.println(1 + 8 + "5"); // 95

        String s = "animals";
        System.out.println(s.length()); // 7
        System.out.println(s.charAt(0)); // 'a'
        System.out.println(s.charAt(6)); // 's'
        // System.out.println(s.charAt(10)); // throws StringIndexOutOfBoundsException

        System.out.println(s.indexOf('a')); // 0
        System.out.println(s.indexOf("al")); // 4
        System.out.println(s.indexOf("acb")); // -1
        System.out.println(s.indexOf('a', 4)); // 4
        System.out.println(s.indexOf("al", 5)); // -1
        System.out.println(s.lastIndexOf('a')); // 4

        System.out.println(s.substring(3)); // 'mals'
        System.out.println(s.substring(3, 4)); // 'm'
        System.out.println(s.substring(3, 7)); // 'mals'
        // System.out.println(s.substring(1, 10)); // throws StringIndexOutOfBoundsException

        System.out.println(s.toUpperCase()); // ANIMALS
        System.out.println("ABc123".toLowerCase()); // abc123
        System.out.println(s); // animals

        System.out.println("abc".equals("ABC")); // false
        System.out.println("ABC".equals("ABC")); // true
        System.out.println("abc".equalsIgnoreCase("ABC")); // true

        System.out.println("abc".startsWith("a")); // true
        System.out.println("abc".startsWith("A")); // false
        System.out.println("abc".endsWith("c")); // true
        System.out.println("abc".endsWith("a")); // false
        System.out.println("abc".concat("b")); // true
        System.out.println("abc".concat("B")); // false

        System.out.println("abcabc".replace('a', 'A')); // AbcAbc

        System.out.println(" abc".trim()); // abc

        String s1 = " abc";
        s1.trim();
        s1.toUpperCase();
        System.out.println(s1); // ' abc'

        String s2 = s1.trim().toUpperCase();
        System.out.println(s2); // ABC

    }
}
