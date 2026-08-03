package Basics.PracticeQuestions;

import java.util.Scanner;

public class PassingMarks {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks in physics");
        int phy =sc.nextInt();
        System.out.println("enter marks in chemistry");
        int chem =sc.nextInt();
        System.out.println("enter marks in mathematics");
        int math =sc.nextInt();
        float avg = (phy+chem+math)/3.0f;
        if(avg>=40 && phy>=33 && chem>=33 && math>=33){
            System.out.println("you passed your exam" );
        }
        else{
            System.out.println("you failed your exam");
        }

    }
}
