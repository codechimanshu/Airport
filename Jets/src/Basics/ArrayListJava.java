package Basics;

import java.util.*;

public class ArrayListJava{
    public static void main(String[] args){
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(4);
        l2.add(11);
        l2.add(22);
        l2.add(33);
        l2.add(44);
        l1.add(1);
        l1.add(44);
        l1.add(3);
        l1.add(0,0);
        l1.add(2,7);
        l1.addAll(3,l2);
        l1.set(1,55);
//        l1.clear();
        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i)+", ");
        }
        System.out.println(l1.contains(8));
        System.out.println(l1.indexOf(44));
        System.out.println(l1.indexOf(123));
        System.out.println(l1.lastIndexOf(44));
    }
}
