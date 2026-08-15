package Basics.PracticeQuestions;

import java.util.Scanner;

public class NumInArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();
        boolean found = false;
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        for (int i : arr) {
            if (n==i) {
                found = true;
                break;
            }
        }
        if (found){
            System.out.println("The number is found");
        }
        else {
            System.out.println("The number is not found");
        }
    }
}
