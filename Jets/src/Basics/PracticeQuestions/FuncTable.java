package Basics.PracticeQuestions;

public class FuncTable {

    static void table(int a ){
        int x = 0;
        for(int i=1;i<11;i++){
            System.out.println(a+" X "+i+" = "+a*i);
        }
    }

    static void main(){
        table(5);
    }
}
