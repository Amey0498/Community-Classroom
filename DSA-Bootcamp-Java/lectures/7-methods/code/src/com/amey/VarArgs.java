package com.amey;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(232132, 2323, 211, 33, 's', 31, 'a', 32,Math.addExact('s','d'));
        System.out.println("FloorDiv Output : "+ Math.floorDiv(Math.addExact('A','A'),'A'));
        mixedBagArgs(2, 44, "Kunal", "Rahul", "Kaiwalya");
        demo(2,3,4,'t', 'e','r','r','y');
        demo("2","3","4","t","e","r", "r","y");
    }

    static void demo (int ...values) {
        System.out.println("Integer array");
        System.out.println(Arrays.toString(values));
    }
    static void demo (String ...values) {
        System.out.println("String array");
        System.out.println(Arrays.toString(values));
    }
    static void mixedBagArgs (int num1, int num2, String ...stringValues ) {
        System.out.print(num1 + " " + num2 + " ");
        System.out.println(Arrays.toString(stringValues));
    }
    static void fun (int ...integerValues){
        System.out.println(Arrays.toString(integerValues));
    }
}
