package Basics;

import java.util.*;

/**
 * This is a good class
 */

public class JavaDocsMethod {
    /**
     *
     * @param args These are the arguments supplied  to the command line
     */

     public static void main(String[] args) {
        System.out.println("I am in main method");
    }

    /**
     * Hello this is a method
     * @param a This is the first no to add
     * @param b This the second no to add
     * @return Sum of two no as an integer
     * @throws Exception if i is 0
     * @deprecated This method is deprecated please use + operator
     */
    public int add(int a, int b)throws Exception{
        if(a == 0){
            throw new Exception("Not valid input");
        }
        int c = a + b;
        return c;
    }
}
