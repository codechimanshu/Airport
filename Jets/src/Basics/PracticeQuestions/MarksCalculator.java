package Basics.PracticeQuestions;

//import java.util.Scanner;
//
//public class MarksCalculator {
//    static void main() {
//        Scanner sc=new Scanner(System.in);
//        System.out.print("enter your name :");
//        String name =sc.nextLine();
//        Scanner sc1 = new Scanner(System.in);
//        System.out.println("english marks :");
//        int a1=sc1.nextInt();
//        System.out.println("hindi marks :");
//        int a2=sc1.nextInt();
//        System.out.println("maths marks :");
//        int a3=sc1.nextInt();
//        System.out.println("science marks :");
//        int a4=sc1.nextInt();
//        System.out.println("social marks :");
//        int a5=sc1.nextInt();
//        float total=(a1+a2+a3+a4+a5)/5;
//        System.out.println("total marks :"+total);
//    }
//}

import java.util.Scanner;

public class MarksCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("English marks: ");
        int a1 = sc.nextInt();

        System.out.print("Hindi marks: ");
        int a2 = sc.nextInt();

        System.out.print("Maths marks: ");
        int a3 = sc.nextInt();

        System.out.print("Science marks: ");
        int a4 = sc.nextInt();

        System.out.print("Social marks: ");
        int a5 = sc.nextInt();

        int total = a1 + a2 + a3 + a4 + a5;
        float average = total / 5.0f;

        System.out.println("\nStudent: " + name);
        System.out.println("Total marks: " + total);
        System.out.println("Average marks: " + average);

        sc.close();
    }
}

