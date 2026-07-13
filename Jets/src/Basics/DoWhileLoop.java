package Basics;

public class DoWhileLoop {
    static void main() {

        int i=5;
        do{
            System.out.println(i);
            i++;
        }while(i<13);

        //it prints 15 becasue it check condition after entering the loop
        int j=15;
        do{
            System.out.println(j);
            j++;
        }while(j<13);
    }
}
