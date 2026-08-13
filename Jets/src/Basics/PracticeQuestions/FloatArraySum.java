package Basics.PracticeQuestions;

import java.util.Scanner;

public class FloatArraySum {
    static void main() {
        float sum = 0;
        float [] a = new float[5];
        Scanner input = new Scanner(System.in);

        for (int i =0 ;i<a.length ;i++) {
            a[i] = input.nextFloat();
            sum += a[i];
        }
        System.out.println("The sum is " + sum);

    }
}
