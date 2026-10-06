package Basics;

class Mythread extends Thread {
    @Override
    public void run() {
        int i=0;
        while (i<100) {
            System.out.println("Mythread run");
            System.out.println("I am Happy");
            i++;
        }
    }
}

class Mythread1 extends Thread {
    @Override
    public void run() {
        int i=0;
        while (i<100) {
            System.out.println("Mythread1 run");
            System.out.println("I am Sad");
            i++;
        }
    }
}

public class Multithreading {
    static void main() {
        Mythread t1 = new Mythread();
        Mythread1 t2 = new Mythread1();
        t1.start();
        t2.start();
    }
}
