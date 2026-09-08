package Basics;

class mainemployee{
    private int id;
    private String name;

//------------------------------------------

    public mainemployee(){
        id=10;
        name=" Gaurav";
    }

    public mainemployee(String name){
        id=20;
        this.name=name;
    }

    public mainemployee(int empid,String empname){
        id=empid;
        name=empname;
    }

//------------------------------------------------

    public void setid(){
        id=30;
    }
    public int getId(){
        return id;
    }
    public void setname(String n){
        name=n;
    }
    public String getName(){
        return name;
    }

}

//---------------------------------------------------

public class ConstructorsOverloading {
    public static void main(String[] args) {

        mainemployee a=new mainemployee();
        System.out.print(a.getId());
        System.out.println(a.getName());

        mainemployee b=new mainemployee(" disha");
        System.out.print(b.getId());
        System.out.println(b.getName());

        mainemployee c=new mainemployee(72," deepak");
        System.out.print(c.getId());
        System.out.println(c.getName());

        a.setid();
        System.out.print(a.getId());
        a.setname(" Dhruv");
        System.out.println(a.getName());



    }
}
