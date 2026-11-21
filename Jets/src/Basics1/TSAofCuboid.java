package Basics1;

public class TSAofCuboid {
    static void main() {
        int length = 5;
        int width = 3;
        int height = 2;
        int area = 2*((length*width)+(width*height)+(height*length));
        System.out.println("Total Surface Area of Cuboid is: " + area);
    }
}
