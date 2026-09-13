package Basics;

class Base1 {
    int x;

    Base1() {
        System.out.println("I am a Constructor");
    }
    Base1(int a) {
        System.out.println("I am a overloaded Constructor with value of a="+a);
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
}


class Derived1 extends Base1{
    int y;

    Derived1(){
        System.out.println("I am a Derived Constructor");
    }
    Derived1(int a, int b) {
        super(7);
        System.out.println("I am a overloaded Constructor of derived with value of b=" + b);
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}



public class ConstructorINInheritance {
    static void main() {
        Base1 b=new Base1();
        Derived1 d =new Derived1();
        Derived1 d1 =new Derived1(5,6);

    }
}
