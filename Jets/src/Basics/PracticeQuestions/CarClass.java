package Basics.PracticeQuestions;

class Car{
    String Brand,color;
    int price;
    public void printdetails(){
        System.out.println("Car Details:");
        System.out.println(Brand);
        System.out.println(color);
        System.out.println(price);
    }

}

public class CarClass {
    public static void main(String[] args) {
        Car Toyota = new Car();
        Toyota.Brand = "Toyota";
        Toyota.color = "Red";
        Toyota.price = 100;
        Toyota.printdetails();
    }
}
