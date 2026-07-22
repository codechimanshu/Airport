package Basics;

public class MethodOverloading {

    // void method is used , when we don't have to return the value
    static void gm(){
        System.out.println("Good Morning");
    }

    //check weather the vlue changes or not
    static int change(int a){
        a=100;
        return a;
    }

    // to change the element in array
    static void chnarr(int [] pas){
        pas[0]=100;
    }

    //Method overloading
    static void sec(){
        System.out.println("Good Morning");
    }
    static void sec(int a){
        System.out.println("Good Morning "+ a +" times");
    }

    //this is the main method
    static void main(){

        //using void method
        gm();

        //the value does not change in the method
        int x=55;
        change(x);
        System.out.println("after change the x value in method "+x);

        //change the element in the array using method
        int [] arr={89,78,98,87,45,56,12,23,65,54};
        chnarr(arr);
        System.out.println("after change the arr value in method "+ arr[0]);

        //Method overloading
        sec();
        sec(89);  //Arguments are actual
    }
}
