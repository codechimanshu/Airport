package Basics.PracticeQuestions;

import java.util.Scanner;

public class FuncPatternUP {

    static void pattern(int n){
        for(int i=n;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("no. of line in pattern :");
        int x = sc.nextInt();
        pattern(x);

    }
}
