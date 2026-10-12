package Basics.PracticeQuestions;

class MyThread extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<500){
            System.out.println("Good Morning...");
            i++;
        }
    }
}

class MyThread1 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<500){
//            try{
//            Thread.sleep(500);
//            }
//            catch(Exception e){
//                System.out.println(e);
//            }
            System.out.println("Good Afternoon...");
            i++;
        }
    }
}

public class ThreadSleep {
    static void main() {
        MyThread mt = new MyThread();
        MyThread1 mt1 = new MyThread1();
        mt.start();
//        try{
//            mt.sleep(500);
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
        mt1.start();
    }
}
