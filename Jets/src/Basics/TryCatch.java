package Basics;

public class TryCatch {
    static void main() {
        int a= 6000;
        int b= 0;
        //WITHOUT TRY
//        int c=a/b;
//        System.out.println("The result is :" +c);
        //WITH TRY
        try{
            int d=a/b;
            System.out.println("The result is :" +d);
        }
        catch(Exception e){
            System.out.println("We failed to divide .Reason: ");
            System.out.println(e);
        }
    }
}
