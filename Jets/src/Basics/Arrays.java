package Basics;

public class Arrays {
    static void main() {

        //there are three main ways to create an Array

        //1. Declaration and memory allocation
//        int[] marks = new int[5];

        //2. Declaration and then memory allocation
        int [] marks;
        marks =new int [5];

        //Initialization
        marks[0] = 127;
        marks[1] = 127;
        marks[2] = 17;
        marks[4] = 56;
        marks[4] = 57;
//        marks[5] = 56;     throws an error

        //Declaration , Memory allocation And Initialization together
        int [] marks2= {56,78,25,59,25};

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[4]);
        System.out.println(marks[3]);
    }
}
