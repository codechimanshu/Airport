package Basics;

class Mythr1 extends Thread{
    public Mythr1(String name){
        super(name);
    }
    public void run(){
        System.out.println("My thread start" + this.getName());
        int i=0;
        while(i<50){
//            System.out.println("Running Thread");
            i++;
        }
    }
}

public class ThreadPriorities {
    public static void main(String[] args) {
        Mythr1 t1 = new Mythr1("Mythr1");
        Mythr1 t2 = new Mythr1("Mythr2");
        Mythr1 t3 = new Mythr1("Mythr3");
        Mythr1 t4 = new Mythr1("Mythr4");
        Mythr1 t5 = new Mythr1("Mythr5 (most important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }

}
