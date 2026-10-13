package Basics.PracticeQuestions;

class MyThread2 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<500){
            System.out.println("Good Morning...");
            i++;
        }
    }
}

class MyThread3 extends Thread{
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

public class ThreadPriority{
    static void main() {
        MyThread2 mt2 = new MyThread2();
        MyThread3 mt3 = new MyThread3();
//        mt2.setPriority(9);
//        mt3.setPriority(10);
        System.out.println(mt2.getPriority());
        System.out.println(mt3.getPriority());
        mt2.start();
//        try{
//            mt.sleep(500);
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
        mt3.start();
    }
}