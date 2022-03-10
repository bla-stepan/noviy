package zadanie;

import java.awt.*;

public class Test {
    public static void main(String[] args) {

        int a = 60;//60= 0011 1100
        int b = 13;//13 = 0000 1101
        int c = 0;//result

        c = a & b;//12 = 0000 1100
        System.out.println("a & b = " + c);

        c = a | b;//61 = 0011 1101
        System.out.println("a | b = " + c);

        c = a << 2;//240 = 1111 0000
        System.out.println("a << 2 = " + c);
/*
        boolean a = false;
        boolean b = 4 < 5;
        boolean c = 3 > 7;

        System.out.println(false);
        System.out.println(a || b || c);
        System.out.println(!(a && b && c));
 */
    }
}

