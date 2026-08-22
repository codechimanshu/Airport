package Basics.PracticeQuestions;

public class SUMRec {
    static int sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sum(n - 1);
        }
    }

    static void main(){
        System.out.println("the sum of n natural no. is "+sum(5));
    }
}
