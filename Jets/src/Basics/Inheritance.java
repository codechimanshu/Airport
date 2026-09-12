package Basics;

class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }
}
class Derived extends Base {
    int y;
}



public class Inheritance {
    static void main() {

//    Creating an object of Base class
    Base b=new Base();
    b.setX(10);
    System.out.println(b.getX());

//    Creating an object of Derived class
    Derived d=new Derived();
    d.setX(25);
    System.out.println(d.getX());

//    Creating an object of Derived using Base class
    Base p=new Derived();
    p.setX(20);
    System.out.println(p.getX());

//    Base[] a=new Base[3];
//    a[0]=b;
//    a[1]=d;
//    a[2]=d;
//    System.out.println(a[0].getX());
//    System.out.println(a[1].getX());
    }
}
