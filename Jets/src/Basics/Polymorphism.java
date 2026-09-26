package Basics;

interface Camera2{
    void clickPhoto();
    void recordVideo();
    private void SwitchOn(){
        System.out.println("Switch On");
    }
    default void recordAudio(){
        SwitchOn();
        System.out.println("Recording Audio");
    }
}

interface WiFi2{
    String[] GetNetwork();
    void ConnectToNetwork(String Network);
}

class Cellphone2{

    void CallNumber(int number){
        System.out.println("Call Number: "+number);
    }
    void IncomingCall(String name){
        System.out.println("Incoming Call: "+name);
    }
}

class SmartPhone2 extends Cellphone2 implements WiFi2, Camera2{
    public void clickPhoto(){
        System.out.println("Taking photo...");
    }
    public void recordVideo(){
        System.out.println("Recording Video...");
    }
    public String[] GetNetwork(){
        System.out.println("Getting Network...");
        String[] NetworkList ={"Sumit","Ravi","Kanish"};
        return NetworkList;
    }
    public void     ConnectToNetwork(String Network){
        System.out.println("Connecting to Network: "+Network);
    }
    //    public void recordAudio(){
//        System.out.println("Recording Audio with microphone");
//    }
    void Music(){
        System.out.println("Playing Music");
    }
}

public class Polymorphism {
    static void main() {
        Camera2 sm = new SmartPhone2();
        sm.clickPhoto();
        sm.recordVideo();

    }
}
