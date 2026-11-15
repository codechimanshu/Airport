package Basics;

import java.util.*;

class MyGenerics<T1>{
    int val;
    private T1 t1;
    public MyGenerics(int val, T1 t1){
        this.val = val;
        this.t1 = t1 ;
    }
    public T1 getT1() {
        return t1;
    }
    public void setT1(T1 t1) {
        this.t1 = t1;
    }
    public int getVal() {
        return val;
    }
    public void setVal(int val) {
        this.val = val;
    }
}

public class Generics {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList();
//        ArrayList<Integer> arraylist = new ArrayList();    //This will produce an error
//        arraylist.add("string");
        arraylist.add(54);
        arraylist.add(88);
//        arraylist.add(new Scanner(System.in));

        int a = (int) arraylist.get(0);
//        System.out.println(a);
        MyGenerics<String> g1 = new MyGenerics(23,"MyString is my string");
        String str = g1.getT1();
        System.out.println(str);
    }
}
