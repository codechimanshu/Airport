package Basics;

class NegativeRadiusException extends Exception{
    public String toString(){
        return "Radius cannot be negative";
    }
    public String getmessage(){
        return "Radius cannot be negative!";
    }
}

public class Throw_Throws {
    public static double Area(int r)throws NegativeRadiusException{
        if(r<0)
            throw new NegativeRadiusException();
        double result = Math.PI*r*r;
        return result;
    }
    public static int Divide(int a, int b)throws ArithmeticException{
        //Made by Durgeshwari
        int result=a/b;
        return result;
    }
    public static void main(String[] args) {
        //Ishika - uses divide function made by Durgeshwari
        try{
//            int c = Divide(1,2);
//            System.out.println(c);
            double d = Area(6);
            System.out.println(d);
        }
        catch(Exception e){
            System.out.println("Exception");
        }
    }
}
