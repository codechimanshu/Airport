package Basics;

public class Operators {
    static void main() {
        int a=4;

        //logical operators----------
        int b=6 - a;
        int c=a+b;
        int d=a*b;
        int e=b%a;

        //assignment operators----------
        b += 3;

        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        //comparison operators----------
        System.out.println(6==8);
        System.out.println(6==6);
        System.out.println(64>24);

        //logical operators-------------
        System.out.println(64>5 && 64>8);
        System.out.println(64>6 && 64<5);
        System.out.println(64>6 || 64>8);
        System.out.println(64>6 || 64<5);

    }
}

