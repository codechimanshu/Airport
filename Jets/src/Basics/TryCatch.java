package Basics;

public class TryCatch {
    static void main() {
        int a= 6000;
        int b= 9;
        //WITHOUT TRY
        int c=a/b;
        System.out.println("The resukt is" +c);
        //WITH TRY
        try{
            int d=a/b;
            System.out.println("The resukt is" +d);
        }
        catch(Exception e){
            System.out.println("We failed to divide .Reason: ");
            System.out.println(e);
        }
    }
}
