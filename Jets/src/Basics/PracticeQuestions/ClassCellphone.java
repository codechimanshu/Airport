package Basics.PracticeQuestions;

class cellphone{
    public void ring(){
        System.out.println("ringing...");
    }
    public void vibrate(){
        System.out.println("vibrating...");
    }
}

public class ClassCellphone {
    static void main() {
        cellphone nothing = new cellphone();
        nothing.ring();
        nothing.vibrate();
    }
}
