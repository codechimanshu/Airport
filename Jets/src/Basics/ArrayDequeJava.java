package Basics;

import java.util.ArrayDeque;

public class ArrayDequeJava {
    static void main() {
        ArrayDeque<Integer> a = new ArrayDeque<>();
        a.add(1);
        a.add(2);
        a.addFirst(3);
        a.addLast(4);
        System.out.println(a.getFirst());
        System.out.println(a.getLast());
    }
}
