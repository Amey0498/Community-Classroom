package com.amey;

public class Shadowing {
    static int x = 90;  // this will be shadowed at line 8
    static int y = 100;
    public static void main(String[] args) {
        System.out.println("Global static variable x in main method: "+ x); //90
        System.out.println("Global static variable y in main method: "+ y); //100
        int x = 40;     // the class variable at line 4 is shadowed by this
        int y;          // initialization
        /*
        * System.out.println(y);
        * scope will begin when value is initialized
        * */
        y = 24;         // declaration
        System.out.println("Shadowed x: " + x);                             //40
        System.out.println("Shadowed y: " + y);
        fun();
    }
    static void fun(){
        System.out.println("Global x in fun method: " +x);                  //90
        System.out.println("Global y in fun method: " +y);
    }
}
