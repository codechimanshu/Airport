package Basics.PracticeQuestions;

public class Fibonacci {
    static int fibo(int n){
        if (n==1 || n==2){
            return n-1;
        }
        else{
            return  fibo(n-1)+fibo(n-2);
        }
    }

    static void main() {
        System.out.println(fibo(5)) ;
    }
}
