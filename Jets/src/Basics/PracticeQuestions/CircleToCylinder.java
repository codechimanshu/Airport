package Basics.PracticeQuestions;

import javax.xml.transform.Source;
import java.sql.SQLOutput;

class Circle{
    int radius;

    Circle(int radius){
        System.out.println("I am circle parameterized constructor");
        this.radius = radius;
    }

    double perimeter(){
        return 2*Math.PI*radius;
    }

    double area(){
        return Math.PI*radius*radius;
    }
}


class Cylinder extends Circle{
    int height;

    Cylinder(int radius, int height){
        super(radius);
        System.out.println("I am cylinder parameterized constructor");
        this.height = height;
    }

    double Area(){
        return (2*Math.PI*radius*radius)+(2*Math.PI*radius*height);
    }
}

public class CircleToCylinder {
    public static void main(String[] args) {
        Cylinder C1 = new Cylinder(1,2);
        System.out.println("Area of Cylinder :"+C1.Area());
    }
}
