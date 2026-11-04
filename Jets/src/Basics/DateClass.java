package Basics;

import java.util.Date;

public class DateClass {
    static void main() {
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(System.currentTimeMillis());
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getDate());
        System.out.println(date.getSeconds());
        System.out.println(date.getMinutes());
        System.out.println(date.getHours());
    }
}
