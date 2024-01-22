package beenary.dev.chapter2;

import static beenary.dev.chapter2.Zoo.MAX_CAPACITY;

public class ZooDemo {

    public static void main(String[] args) {
        System.out.println(MAX_CAPACITY);

boolean x = false, z = false;
int y = 15;
x = (y != 10) ^ (z=false);
System.out.println(x+", "+y+", "+z);
    }
}
