package Basics;

interface main{
    void Meth1();
    void Meth2();
}

interface child extends main{
    void Meth3();
    void Meth4();
}

class sample implements child{
    public void Meth1() {
        System.out.println("Meth1");
    }
    public void Meth2() {
        System.out.println("Meth2");
    }
    public void Meth3(){
        System.out.println("Meth3");
    }
    public void Meth4(){
        System.out.println("Meth4");
    }
}

public class InheritanceInInterface {
    static void main() {
        sample s=new sample();
        s.Meth1();
        s.Meth2();
        s.Meth3();
        s.Meth4();
    }
}
