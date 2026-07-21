package Basics;

import java.util.Scanner;

public class Methods {
    // Method is also called functions

    static int func(int x, int y ){
        int z;
        if(x > y){
            z = (x - y);
        }
        else{
            z = y+x;
        }
        return z;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = func(a, b);
        System.out.println(result);
    }
}
