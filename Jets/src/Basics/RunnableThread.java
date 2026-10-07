package Basics;

class MythreadRunnable1 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("I am a runnable thread1");
            i++;
        }
    }
}

class MythreadRunnable2 implements Runnable {
    @Override
    public void run() {
        for (int i=1;i<10;i++){
            System.out.println("I am a runnable thread2");
        }
    }
}

public class RunnableThread {
    public static void main(String[] args) {
        MythreadRunnable1 bullet1 = new MythreadRunnable1();
        Thread gun1 = new Thread(bullet1);
        MythreadRunnable2 bullet2 = new MythreadRunnable2();
        Thread gun2  = new Thread(bullet2);


        gun1.start();
        gun2.start();
    }
}
