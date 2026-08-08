package Basics.PracticeQuestions;

import java.util.Scanner;

public class SumofNno {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n = sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);

    }
}
