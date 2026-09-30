package Basics.PracticeQuestions;

abstract class Telephone1{
    abstract void Ring();
    abstract void Lift();
//    abstract void Disconnect();
}

class SmartTelephone extends Telephone1{
    void Ring(){
        System.out.println("Ring...");
    }
    void Lift(){
        System.out.println("Lift...");
    }
    void Disconnnect(){
        System.out.println("Disconnecting...");
    }
}

public class TelePhone {
    static void main() {
        Telephone1 t = new SmartTelephone();
        t.Ring();
        t.Lift();
//        t.Disconnect();
    }
}
