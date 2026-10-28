package Basics.PracticeQuestions;

import java.util.Scanner;

public class ArrayError {
    static void main() {
        Scanner input = new Scanner(System.in);
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int i=0;
        while(i<5){
            try{
                System.out.print("Enter the value of index :");
                int ind = input.nextInt();
                System.out.println(arr[ind]);
                break;
            }
            catch(Exception e){
                System.out.println("Index out of bounds");
                i++;
            }
        }
        if(i==5){
            System.out.println("Error");
        }
    }
}
