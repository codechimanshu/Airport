package Basics;

class Mythr2 extends Thread{
    public Mythr2(String name){
        super(name);
    }
    public void run(){
        System.out.println("My thread start");
        int i=0;
        while(i<100){
            System.out.println("Running Thread");
            i++;
        }
    }
}

class Mythr3 extends Thread{
    public Mythr3(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("Mythr3 thread start");
            i++;
        }
    }
}

public class ThreadMethods {
    static void main() {
        Mythr2 t1 = new Mythr2("Mythr2");
        Mythr3 t2 = new Mythr3("Mythr3");
        t1.start();
        try{
            t1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        t2.start();
    }
}
