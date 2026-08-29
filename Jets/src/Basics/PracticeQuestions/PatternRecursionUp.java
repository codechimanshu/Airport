package Basics.PracticeQuestions;

public class PatternRecursionUp {

    static int pattern(int n) {
        if (n == 0) {
            return 0;
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print("* ");
            }
            System.out.print("\n");
            return pattern(n - 1);
        }
    }

    static void main() {
        pattern(5);
    }
}
