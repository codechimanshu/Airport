package Basics;

public class WhileLoop {
    static void main() {
        System.out.println("Printing the numbers \nfrom 1 to 53 using while loop");

        int num = 1;

        while (num<54){
            System.out.println(num);
            num++;
        }

        // it does not run anything
        // because it does not go inside the loop

        int mun = 55;

        while (num<54){
            System.out.println(num);
            num++;
        }
    }
}
