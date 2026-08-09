package Basics.PracticeQuestions;

import java.util.Scanner;

public class Factorial {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no. :");
        int n=sc.nextInt();
        int factorial=1;
        for(int i=n;i>0;i--){
            factorial=factorial*i;
        }
        System.out.println("factorial of the given no. is :"+factorial);

    }
}
