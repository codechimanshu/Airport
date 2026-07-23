package Basics;

public class VariableArguments {

//    static int sum(int a, int b) {
//        return a+b;
//    }

    static int sum(int ...arr){
        int result = 0;
        for (int i : arr){
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("the sum of 1 , 2 is :" + sum(1, 2));
        System.out.println("the sum of 1 , 2 , 3 is :" + sum(1, 2,3));
        System.out.println("the sum of 1 ,2 ,3 , 4 is :" + sum(1, 2,3,4));
    }
}
