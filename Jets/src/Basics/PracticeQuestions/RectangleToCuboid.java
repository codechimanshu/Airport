package Basics.PracticeQuestions;

class Rectangle{
    int length;
    int width;
    Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    int perimeter(){
        return 2*(length+width);
    }

    int area(){
        return length*width;
    }
}



class Cuboid extends Rectangle{
    int height;
    Cuboid(int length, int width, int height){
        super(length, width);
        this.height = height;
    }
     int Area(){
        return 2*(length*width + width*height + height*length);
     }

     int Volume(){
        return length*width*height;

     }
}



public class RectangleToCuboid {
    static void main() {
        Cuboid C = new Cuboid(2,4,6);
        System.out.println("Area of cuboid: " +C.Area());
        System.out.println("Volume of cuboid: "+C.Volume());
    }
}
