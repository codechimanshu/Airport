package Basics;

import java.util.Scanner;

public class UserInput {
    static void main() {
        System.out.println("taking input from user input");
        Scanner sc =new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("enter you 1st no.");
        int num =sc.nextInt();
        System.out.println("enter you r 2nd no.");
        int num2 =sc.nextInt();
        int sum=num+num2;
        System.out.println("the sum of the no. is "+sum);
        boolean b= sc.hasNextInt();
        System.out.println(b);
//        String cba=sc2.next();
//        System.out.println(cba);
        String abc =sc2.nextLine();
        System.out.println(abc);


    }

}
