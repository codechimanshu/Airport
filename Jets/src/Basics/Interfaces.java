package Basics;

interface Bicycle{
    void applyBrake(int decrement);
    void speedup(int increment);
}


class AvonCycle implements Bicycle{
    int speed=35;
    public void applyBrake(int decrement){
        speed =speed-decrement;
    }
    public void speedup(int increment){
        speed=speed+increment;
    }
}

public class Interfaces {
    public static void main(String[] args){
        AvonCycle A1Cycle = new AvonCycle();
        A1Cycle.applyBrake(5);
        System.out.println("A1Cycle speed:"+A1Cycle.speed);

    }
}
