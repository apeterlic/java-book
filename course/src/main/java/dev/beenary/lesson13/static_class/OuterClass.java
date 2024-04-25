package dev.beenary.lesson13.static_class;

public class OuterClass {

    public int x = 0;

    public static void main(String... args) {
        OuterClass outerClass = new OuterClass();
        InnerClass innerClass = outerClass.new InnerClass();
        innerClass.info(10);
    }

    class InnerClass {

        public int x = 1;

        void info(int x) {
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("OuterClass.this.x = " + OuterClass.this.x);
        }
    }
}
