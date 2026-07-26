package Basics.PracticeQuestions;

import java.util.Scanner;
public class KMtoMILES {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float m=0.621371f;
        System.out.println("Enter KM :");
        float km = sc.nextFloat();
        float miles = km*m;
        System.out.println("MILES :" + miles);
    }

}
