package com.amey;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        // when we don't know how much size to allocate for the inputs
        // Syntax :
        ArrayList<Integer> list = new ArrayList<>(10);
        ArrayList<Integer> list2 = new ArrayList<>(10);
        // you can not add primitives for arraylist, you have to use wrapper class
        Scanner in = new Scanner(System.in);
        list.add(600);
        list.add(6733);
        list.add(67);
        list.add(670);
        list.add(617);
        list.add(6722);
        list.add(672);
        list.add(687);
        list.add(612);
        list.add(64);
        list.add(62);
        list.add(61);
        list.add(633);
        list.add(622);
        System.out.println(list);
        System.out.println(list.contains(671));
        list.set(0, 671);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);

        // input
        for (int i = 0; i < 5 ; i++) {
            list2.add(in.nextInt());
        }

        // get item using method at any index [0]
        for (int i = 0; i < 5; i++ ) {
            System.out.print(list2.get(i) + " ");   // pass index here, list[index] syntax will not work here
        }
        /*
        * 1. Size is fixed internally
        * 2. Array fills by some amount,
        * it will create a new arraylist of double the size,
        * old elements are copied in new one
        * old ones are deleted
        * amortised time complexity O(1)
        * */
    }
}
