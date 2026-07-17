package Basics;

public class ContinueStatement {
    static void main() {

        System.out.println("continue statement for FOR loop");
        for (int i=0;i<11;i++){
            if(i==7){
                continue;
            }
            System.out.println(i+ " hello world");
        }

        System.out.println("continue statement for while loop");
        int i=0;
        while (i<11){
            if(i==5){
                i++;
                continue;
            }
            System.out.println(i+ " hello world");
            i++;
        }

        System.out.println("continue statement for do while loop");
        int j=0;
        do{
            if(j==9){
                j++;
                continue;
            }
            System.out.println(j+ " hello world");
            j++;
        }while (j<11);
    }
}
