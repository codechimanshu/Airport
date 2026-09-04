package Basics;

    class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("Employee details:");
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
    }
    public void getsalary(){
        System.out.println("Salary :"+salary);
}


}

public class OOPClass {
    public static void main(){

        //Instantiating a new employee object
        Employee Mayank =new Employee();
        Employee Rohit = new Employee();

        //Setting attributes
        Mayank.id=234;
        Mayank.name="Mayank Upadhayay";
        Mayank.salary=2500;
        Rohit.id=456;
        Rohit.name="Rohit Gupta";
        Rohit.salary=3000;

        //Printing the attributes
        Mayank.printDetails();
        Rohit.printDetails();
        Rohit.getsalary();
    }
}
