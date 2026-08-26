package Basics.PracticeQuestions;

public class SetOFno {

    static int sum(int ...arr){
        int sum=0;
        for(int i: arr){
            sum+=i;
        }
        return sum;
    }

    static void main() {
        System.out.println(sum(1,2,3,4,5,6));
    }
}
