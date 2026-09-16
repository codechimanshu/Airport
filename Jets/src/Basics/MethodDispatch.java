package Basics;

class phone{
    public void on(){
        System.out.println("Turning on the phone...");
    }
    public void Time(){
        System.out.println(" show time");
    }
}

class smartphone extends phone{
    public void on(){
        System.out.println("Turning on the smartphone...");
    }
    public void call(){
        System.out.println("calling a person");
    }
}

public class MethodDispatch {
    static void main() {
        phone p = new phone();
        p.on();
        smartphone s = new smartphone();
        s.on();
        phone P1 = new smartphone();    // Allowed
        P1.on();
//        P1.call();  //Not Allowed
//        smartphone P2 = new phone();   //Not Allowed
    }
}
