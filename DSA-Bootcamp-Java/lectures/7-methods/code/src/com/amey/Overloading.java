package com.amey;

import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
        func('a','b','c','d','e','f','g','h','i');
        func("a","b","c","d","e","f","g","h","i");
        func("amey","bhavin","christ","dan","elon","fambruh","geeta","hitesh","icon");
        // overloading happens at compile time - decides which function to run
    }
    static void func(int ...integerValues){
        System.out.println("Integer values function");
        System.out.println(Arrays.toString(integerValues));
    }
    static void func(String ...nameValues){
        System.out.println("String values function");
        System.out.println(Arrays.toString(nameValues));
    }
}
