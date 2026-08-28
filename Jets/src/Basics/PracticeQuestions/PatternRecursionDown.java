package Basics.PracticeQuestions;

import java.util.Scanner;

public class PatternRecursionDown {
     static void pattern(int a){
         if(a>0){
             pattern(a-1);
             for(int i=0;i<a;i++){
                 System.out.print("* ");
             }
             System.out.print("\n");
         }
     }

    static void main() {
         Scanner sc = new Scanner(System.in);
        System.out.print("no. of lines in pattern :");
        int n = sc.nextInt();
        pattern(n);

    }
}
