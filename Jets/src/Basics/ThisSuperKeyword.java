package Basics;

class EkClass{
    int x;

    public int getX() {
        return x;
    }

    EkClass(int x){
        this.x = x;
    }
    public int returnone(){
        return 1;
    }
}

class DoClass extends EkClass{
    DoClass(int y) {
        super(y);
        System.out.println("Mai ek constructor hu");
    }
}

public class ThisSuperKeyword {
    public static void main(String[] args) {
        EkClass e =new EkClass(87);
        DoClass d=new DoClass(8);
        System.out.println(e.getX());
    }
}
