package Basics;

import java.util.Scanner;

public class MultidimensionalArray {
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("printing the multidimensional array");
        int [][] flats = new int[2][3];

        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        for (int i =0 ;i<flats.length ;i++){
            for(int j=0 ;j<flats[i].length ;j++){
                System.out.print(flats[i][j]+" ");
            }
            System.out.print("\n");
        }

        // taking input from user

//        for (int i=0; i<flats.length; i++){
//            for (int j=0; j<flats[i].length; j++){
//                flats[i][j] = sc.nextInt();
//            }
//        }
//        for (int i =0 ;i<flats.length ;i++){
//            for(int j=0 ;j<flats[i].length ;j++){
//                System.out.print(flats[i][j]+" ");
//            }
//            System.out.print("\n");
//        }
    }
}

