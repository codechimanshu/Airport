package Basics.PracticeQuestions;

public class ExceptionCase {
    static void main() {
        int a=6000;
        int b=7;
        try{
            int c =a/b;
        }
        catch(ArithmeticException e){
            System.out.println("HeHe");
        }
        catch(IllegalArgumentException e){
            System.out.println("HaHa");
        }
    }
}
