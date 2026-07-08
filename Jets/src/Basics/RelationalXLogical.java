package Basics;

public class RelationalXLogical {
    public static void main(String[] args) {

        //for logical AND
        boolean a = true;
        boolean b = false;
        boolean c = true;
        if(a && b && c){
            System.out.println("y");
        }
        else{
            System.out.println("n");
        }

        //for logical OR
        boolean d = false;
        boolean e = true;
        boolean f = false;
        if(d || e || f){
            System.out.println("y");
        }
        else{
            System.out.println("n");
        }

        //for logical NOT
        System.out.println("for not (a) is "+ !a);
        System.out.println("for not (b) is "+ !b);
    }
}
