package Basics.PracticeQuestions;

interface TVRemote{
    void SwitchOn();
    void Numbers();
    void SwitchOff();
}

interface SmartTVRemote extends TVRemote{
    void OpenYT();
    void OpenPrime();
}

class TV implements TVRemote{
    public void SwitchOn(){
        System.out.println("Switch on the TV");
    }
    public void Numbers(){
        System.out.println("Press the numbers");
    }
    public void SwitchOff(){
        System.out.println("Switch  off the TV");
    }
}


public class Remote {
    static void main() {
    TV tv = new TV();
    tv.SwitchOn();
    }
}
