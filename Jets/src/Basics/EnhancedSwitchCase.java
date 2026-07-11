package Basics;

import java.util.Scanner;

public class EnhancedSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age :");
        int age = sc.nextInt();

        switch (age) {
            case 18 -> System.out.println("you are going to become adult");
            case 23 -> System.out.println("you are going to get a job");
            case 60 -> System.out.println("you are going to get retired");
            default -> System.out.println("Enjoy your life");
        }
        System.out.println("thanks for using my java code");
    }
}
