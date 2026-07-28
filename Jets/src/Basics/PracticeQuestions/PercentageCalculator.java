package Basics.PracticeQuestions;

import java.util.Scanner;

public class PercentageCalculator {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the marks of sub1 : ");
        int sub1 =sc.nextInt();

        System.out.print("enter the marks of sub2 : ");
        int sub2 = sc.nextInt();

        System.out.print("enter the marks of sub3 : ");
        int sub3 = sc.nextInt();

        System.out.print("enter the marks of sub4 : ");
        int sub4 = sc.nextInt();

        System.out.print("enter the marks of sub5 : ");
        int sub5 = sc.nextInt();

        int sum=sub1+sub2+sub3+sub4+sub5;
        float percentage = sum/5.0f;
        System.out.println("The percentage is "+percentage);
        int a= 7/4;
        System.out.println("print :"+a);
    }
}
