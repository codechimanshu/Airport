package Basics.PracticeQuestions;

import java.util.Scanner;

// still have some issues
// dont know the actual logic of the leap year


public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year :");
        int year = sc.nextInt();
        if (year %4==0 && year%400==0){
            System.out.println("LEAP YEAR");
        }
        else{
            System.out.println("NOT LEAP YEAR");
        }
    }
}
