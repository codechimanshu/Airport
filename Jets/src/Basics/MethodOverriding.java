package Basics;

class A{
    int a;
    public int him(){
        return 8;
    }
    public void meth2(){
        System.out.println("i am method 2 of A");
    }
}

class B extends A{
    int b;
    @Override
    public void meth2() {
        System.out.println("i am method 2 of B");
    }
    public void meth3(){
        System.out.println("i am method 3 of B");
    }
}

public class MethodOverriding {
    static void main() {
        A a = new A();
        a.meth2();
        B b = new B();
        b.meth2();
    }
}
