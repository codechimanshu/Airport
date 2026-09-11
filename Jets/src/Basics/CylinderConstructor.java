package Basics;

class Cylinder {
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public double CylinderSA(int radius, int height) {
        return (2*3.1427*radius*height + 2*3.1427*radius*radius);
    }
    public double CylinderV(int radius, int height) {
        return 3.1427*radius*radius*height;
    }
}

public class CylinderConstructor {
    public static void main(String[] args) {
        Cylinder C1 = new Cylinder(10,12);
//        C1.setRadius(10);
//        C1.setHeight(20);
        System.out.println(C1.CylinderSA(10,20));
        System.out.println(C1.CylinderV(13,28));

    }
}
