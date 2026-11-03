package Basics;

public class DateAndTime {
    static void main() {
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis()/1000);
        System.out.println(System.currentTimeMillis()/1000/3600);
        System.out.println(System.currentTimeMillis()/1000/3600/24);
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
    }
}
