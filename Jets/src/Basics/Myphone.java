package Basics;

interface Camera{
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

interface WiFi{
    String[] GetNetwork();
    void ConnectToNetwork(String Network);
}

class Cellphone{

    void CallNumber(int number){
        System.out.println("Call Number: "+number);
    }
    void IncomingCall(String name){
        System.out.println("Incoming Call: "+name);
    }
}

class SmartPhone extends Cellphone implements WiFi, Camera{
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

public class Myphone{
    public void main(String[] args) {
        SmartPhone S1 = new SmartPhone();
        S1.clickPhoto();
        S1.recordVideo();
        String[] n = S1.GetNetwork();
        for (String item : n) {
            System.out.println(item);
        }
//        S1.SwitchOn();   //-->Throws an Error
        S1.recordAudio();
        S1.Music();
        S1.CallNumber(55);
        S1.IncomingCall("Prashant");
    }
}
