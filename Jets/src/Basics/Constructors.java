package Basics;

class member{
    private int id;
    private String name;
    int age;

    public void setName(String s){
        name=s;
    }
    public void getName(){
        System.out.println("Name is "+name);
    }
    public void setId(int i){
        id=i;
    }
    public int getId(){
        return id;
    }
 

}

public class Constructors {
    public static void main(String[] args) {
        member dhruv = new member();
//        dhruv.id=457;
//        dhruv.name="dhruv rathee"; --> #throws an error due to private access modifier
        dhruv.age = 789;
        dhruv.setName("Dhruv");
        dhruv.setId(11);
        dhruv.getName();
//        System.out.println(dhruv.getName());
        System.out.println(dhruv.getId());

    }
}
