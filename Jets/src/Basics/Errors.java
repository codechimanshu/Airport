package Basics;

import java.util.Scanner;

public class Errors {
    static void main() {
    // SYNTAX ERROR DEMO
//        int a = 1   Error: no semicolon
//        b=2   Error: b not declared

    // LOGICAL ERROR DEMO
        // Write a program to print prime numbers between 1 to 10
        System.out.println(2);
        for(int i=1;i<5;i++){
            System.out.println(2*i+1);
        }

    // RUNTIME ERROR
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divide by k is "+1000/k);  //Exception 0
    }
}
