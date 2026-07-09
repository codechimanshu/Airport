package Basics;

import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter you age :");
        int age = sc.nextInt();
        if (age < 18){
            System.out.println("you are a teenager");
        }
        else if (age <=21 ){
            System.out.println("you are adult");
        }
        else if (age <=60 ){
            System.out.println("you are man");
        }
        else if (age >60){
            System.out.println("you are old");
        }
        else{
            System.out.println("invalid input");
        }

    }
}


