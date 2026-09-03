package Basics.PracticeQuestions;

class employee{
    private int id;
    private String name;

    public int getid(){
        return id;
    }
    public void setid(int x){
        id=x;
    }
    public String getname(){
        return name;
    }
    public void setname(String x){
        name=x;
    }
}

public class PrivateClass {
    static void main() {
        employee sid=new employee();
//        sid.id=23;
//        sid.name="Siddharth Yadav";  //Throws an error due to private access modifier
        sid.setid(456);
        sid.setname("siddharth yadav");
        System.out.println(sid.getid());
    }

}
