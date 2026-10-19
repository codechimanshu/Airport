package Basics;

import java.util.Scanner;

public class NestedTryCatch {
    static void main() {
        int [] marks= new int [3];
        marks[0]=10;
        marks[1]=20;
        marks[2]=30;
        Scanner sc = new Scanner(System.in);
        Boolean flag=true;
        while (flag) {
            System.out.println("Enter the value of index");
            int ind = sc.nextInt();
            try {
                System.out.println("Welcome to my Airport");
                try {
                    System.out.println(marks[ind]);
                    flag=false;
                }
                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry this index is out of bounds!");
                    System.out.println("Execption in the level 2");
                }
            }
            catch (Exception e) {
                System.out.println("Execption in the level 1");
            }
        }
        System.out.println("Thanks for using this program");
    }
}
