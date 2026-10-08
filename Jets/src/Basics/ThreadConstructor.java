package Basics;
class Mythr extends Thread{
    public Mythr(String name){
        super(name);
    }
    public void run(){
        System.out.println("My thread start");
        int i=0;
        while(i<50){
//            System.out.println("Running Thread");
            i++;
        }
    }
}


public class ThreadConstructor {
    public static void main(String[] args) {
        Mythr obj = new Mythr("Ruby");
        Mythr obj2 = new Mythr("Lane");
        obj.start();
        obj2.start();
        System.out.println("The ID of the thread is "+obj.getId());
        System.out.println("The name of the obj1 thread is "+obj.getName());
        System.out.println("The ID of the thread is "+obj2.getId());
        System.out.println("The name of the obj2 thread is "+obj2.getName());
    }
}
