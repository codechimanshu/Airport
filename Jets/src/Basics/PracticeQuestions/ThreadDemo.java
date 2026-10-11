package Basics.PracticeQuestions;

class GM extends Thread{
    public void run(){
        while(true){
            System.out.println("Good Morning");
        }
    }
}

class Wel extends Thread{
    public void run(){
        while(true){
            System.out.println("Welcome");
        }
    }
}

public class ThreadDemo{
    public static void main(String[] args){
        GM gm = new GM();
        Wel wel = new Wel();
        gm.start();
        wel.start();
    }
}
