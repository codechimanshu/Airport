package Basics.PracticeQuestions;

import java.util.Scanner;

public class IncomeTax {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income in lakhs :");
        float income = sc.nextFloat();
        if (income >= 2.5 && income < 5){
            System.out.println("you have to pay 5% Tax");
        }
        else if (income >= 5 && income < 10){
            System.out.println("you have to pay 20% Tax");
        }
        else{
            System.out.println("you have to pay 30% Tax");
        }
    }
}
