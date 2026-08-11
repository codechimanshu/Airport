package Basics.PracticeQuestions;

import java.util.Scanner;

public class MathTableSum {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no. :");
        int n = sc.nextInt();
        int sum=0;
        for (int i=1;i<=10;i++){
            sum+=i*n;
        }
        System.out.println("the sum is "+sum);

    }
}
