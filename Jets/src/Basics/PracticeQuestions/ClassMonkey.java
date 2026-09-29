package Basics.PracticeQuestions;

class Monkey{
    void Jump(){
        System.out.println("Jumping...");
    }
    void Bite(){
        System.out.println("Biting...");
    }
}

interface BasicAnimal{
    void Eat();
    void Sleep();
}

class Human extends Monkey implements BasicAnimal{
    public void Eat(){
        System.out.println("Eating...");
    }
    public void Sleep()  {
        System.out.println("Sleeping...");
    }
}

public class ClassMonkey {
    static void main() {
        Human h = new Human();
        Monkey m = new Human();
//        h.Eat();
        h.Sleep();
        h.Jump();
        h.Bite();
        System.out.println("show Polymorphism using Monkey class");
        m.Bite();
    }
}
