package Basics.PracticeQuestions;

import java.util.Scanner;

class Employee{
    String name;
    int salary;

    public int getsal(){
        return salary;
    }
    public String getname(){
        return name;
    }
    public void setname(String x){
        name =x;
    }
}

public class EmployeeClass {
    public static void main() {
        Employee harsh = new Employee();
        harsh.name = "harsh kumar";
        harsh.salary = 10000;
        System.out.println(harsh.getsal());
        System.out.println(harsh.getname());
        harsh.setname("mayank kumar");
        System.out.println(harsh.getname());
    }
}
