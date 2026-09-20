package Basics;

abstract class Parent{
    Parent(){
        System.out.println("I am a constructor of parent class");
    }
    void sayHello(){
        System.out.println("Hello Everyone");
    }
    abstract public void greet();
    abstract public void greet1();
}


class Child extends Parent{
    public void greet() {
        System.out.println("Good Morning");
    }
    public void greet1() {
        System.out.println("Namaste");
    }
}


abstract class Child1 extends Parent{
    void name(){
        System.out.println("What's your name");
    }
}


public class AbstractClass {
    static void main() {
//        Parent p = new Parent();    //--------Throws an error
        Child C1 = new Child();
        C1.greet();
        C1.greet1();
//        Child1 C2 =new Child1();     //--------Throws an error
    }
}
