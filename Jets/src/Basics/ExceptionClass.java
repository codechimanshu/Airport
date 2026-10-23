package Basics;

import java.util.Scanner;

class MyException extends Exception {
    public String toString(){
        return "I am to String";
    }
    public String getmessage(){
        return "I am to getMessage()";
    }
}

class MaxAgeException extends Exception {
    public String toString(){
        return "Age cannot be the greater than 125";
    }
    public String getmessage(){
        return "Make sure that the value of age entered is correct";
    }
}

public class ExceptionClass {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a ;
        System.out.println("Enter an integer");
        a=sc.nextInt();
        if (a<9){
            try {
//                throw new MyException();
//                throw new MaxAgeException();
                throw new ArithmeticException("This is an exception");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Yes Finished");
        }
    }
}
