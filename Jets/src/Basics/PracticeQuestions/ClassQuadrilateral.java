package Basics.PracticeQuestions;

class square{
    int side;
    public int area(){
        return (side*side);
    }
    public int perimeter(){
        return (4*side);
    }
}

class rectangle{
    int length;
    int width;
    public int area(){
        return (length*width);
    }
    public int perimeter(){
        return (2*(length+width));
    }
}

public class ClassQuadrilateral {
    static void main() {

        //Square
        square s1=new square();
        s1.side=15;
        System.out.println(s1.area());
        System.out.println(s1.perimeter());

        //Rectangle
        rectangle r1=new rectangle();
        r1.length=4;
        r1.width=2;
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
    }
}
