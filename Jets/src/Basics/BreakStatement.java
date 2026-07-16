package Basics;

public class BreakStatement {
    static void main() {

        System.out.println("Break statement for FOR loop");
        for (int i=0;i<11;i++){
            System.out.println(i+ " hello world");
            if (i==8){
                break;
            }
        }

        System.out.println("Break statement for while loop");
        int i=0;
        while(i<=10){
            System.out.println(i+ " hello world");
            if (i==7){
                break;
            }
            i++;
        }

        System.out.println("Break statement for do while loop");
        int j=0;
        do{
            System.out.println(j+ " hello world");
            if (j==5){
                break;
            }
            j++;
        }while(j<=10);

    }
}
