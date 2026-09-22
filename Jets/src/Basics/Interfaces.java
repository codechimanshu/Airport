package Basics;

interface Bicycle{
//    int speed=45;
    void applyBrake(int decrement);
    void speedup(int increment);
}

interface BlowHorn{
    void YPD();
    void PP();
}

class AvonCycle implements Bicycle,BlowHorn{
    int speed=56;
    void BlowHorn(){
        System.out.println("peep... poop...");
    }
    public void applyBrake(int decrement){
        speed =speed-decrement;
    }
    public void speedup(int increment){
        speed=speed+increment;
    }
    public void YPD(){
        System.out.println("Yamala Pagala Deewana...");
    }
    public void PP(){
        System.out.println("peep peep poop poop... ");
    }
}

public class Interfaces {
    public static void main(String[] args){
        AvonCycle A1Cycle = new AvonCycle();
        A1Cycle.applyBrake(5);
//        You can create properties in Interface
        System.out.println("A1Cycle speed:"+A1Cycle.speed);


//        You can not modify the properties in Interface as they are final
//        A1Cycle.speed = 6;

        A1Cycle.YPD();
        A1Cycle.PP();
        A1Cycle.BlowHorn();

    }
}
