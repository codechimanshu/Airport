package Basics;

public class ArrayOperation {
    static void main() {
        int [] marks ={56,89,45,78,32};
        System.out.println(marks.length);

        //Display array element using loop
        System.out.println("Display array element using loop");
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

        //Display array element using for-each loop
        System.out.println("Display array element using for-each loop");
        for(int i : marks) {
            System.out.println(i);
        }
    }
}
