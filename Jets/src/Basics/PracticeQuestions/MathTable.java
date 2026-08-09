package Basics.PracticeQuestions;

import java.util.Scanner;

public class MathTable {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to print the table: ");
        int n = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+" x "+i+" = "+(n*i));
        }

    }
}
