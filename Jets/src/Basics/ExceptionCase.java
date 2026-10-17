package Basics;

import java.util.Scanner;

public class ExceptionCase {
    static void main() {
        int [] marks = new int[3];
        marks[0]=56;
        marks[1]=60;
        marks[2]=64;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Array index: ");
        int ind=sc.nextInt();
        System.out.println("enter the no. you want to divide the value with: ");
        int number=sc.nextInt();
        try{
            System.out.println("the value at array index entered is: "+marks[ind]);
            System.out.println("Now the value of array is: "+ marks[ind]/number);
        }

        catch(ArithmeticException e){
            System.out.println("ArithmeticException occured! ");
            System.out.println(e);
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured! ");
            System.out.println(e);
        }

        catch(Exception e){
            System.out.println("Some other Exception occured! ");
            System.out.println(e);
        }
    }
}
