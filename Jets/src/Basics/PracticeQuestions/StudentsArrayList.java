package Basics.PracticeQuestions;

import java.util.ArrayList;

public class StudentsArrayList {
    static void main() {
        ArrayList ar = new ArrayList();
        ar.add("Himanshu");
        ar.add("Durgeshwari");
        ar.add("Ishika");
        ar.add("Kartik");
        ar.add("Palak");
        ar.add("Aayaam");
        ar.add("Nevit");
        ar.add("Rohit");
        ar.add("Pari");
        ar.add("Siddharth");
        ar.add("Anay");
        ar.add("Avika");
        ar.add("Shreya");

        for(Object o : ar){
            System.out.println(o);
        }
    }
}
