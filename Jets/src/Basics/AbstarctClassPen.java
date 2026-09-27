package Basics;

abstract class pen{
    abstract void refill();
    abstract void wrirte();
}

class FountainPen extends pen{
    void refill(){
        System.out.println("Refilling");
    }
    void wrirte(){
        System.out.println("Writing");
    }
    void ChangeNib(){
        System.out.println("Changing Nib");
    }
}

public class AbstarctClassPen{
    static void main(){
        FountainPen fp = new FountainPen();
        fp.refill();
        fp.wrirte();
        fp.ChangeNib();
    }
}
