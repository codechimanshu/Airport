package Basics.PracticeQuestions;

import java.util.Scanner;

public class SUMof3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a+b+c;
        System.out.println("the sum of three no. is "+sum);
        System.out.println(sum);
    }
}
