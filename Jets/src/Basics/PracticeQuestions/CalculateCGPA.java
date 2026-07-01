package Basics.PracticeQuestions;

import java.util.Scanner;
public class CalculateCGPA {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your makrs");
        System.out.println("sub1 ");
        int a=sc.nextInt();
        System.out.println("sub2 ");
        int b=sc.nextInt();
        System.out.println("sub3 ");
        int c=sc.nextInt();
        float CGPA =(a+b+c)/30.0f;
        System.out.println("the CGPA is "+CGPA);

    }
}

