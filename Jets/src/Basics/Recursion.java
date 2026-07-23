package Basics;

public class Recursion {

    static int factorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }
    public static void main(){
        System.out.println("the factorial is :"+ factorial(4));
    }
}
  