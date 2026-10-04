package Basics;

//              | Public | Protected | Default | Private |
//  Class     -     Y    |     Y     |    Y    |    Y
//  Package   -     Y    |     Y     |    Y    |    N
//  Subclass  -     Y    |     Y     |    N    |    N
//  World     -     Y    |     N     |    N    |    N

import java.sql.SQLOutput;

class C1{
    public int a=1;
    protected int b=2;
    int c=3;
    private int d=4;
    public void def(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
class C2 extends C1{
    void f1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);  // Worked because it is in the same package
//        System.out.println(d);  ---> can't use private
    }
}

public class AccessModifier {
    public static void main(String[] args) {
        C1 c1 = new C1();
        c1.def();
        C2 c2 = new C2();
        c2.f1();
        System.out.println(c1.a);
        System.out.println(c1.b);
        System.out.println(c1.c);
//        System.out.println(c1.d); ---> can't use private
    }
}
