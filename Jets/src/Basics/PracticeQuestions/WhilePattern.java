package Basics.PracticeQuestions;

public class WhilePattern {
    static void main() {
        int i=4;
        while(i>0){
            int j=i;
            while(j>0) {
                System.out.print("* ");
                j--;
            }
            System.out.print("\n");
            i--;
        }
    }
}
