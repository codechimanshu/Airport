package Basics1;

import java.util.Scanner;

public class VolumeOfCircle {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        int radius = input.nextInt();
        double area = (4*Math.PI*radius*radius*radius)/3;
        System.out.println("Volume of Circle is: " + area);
    }
}
