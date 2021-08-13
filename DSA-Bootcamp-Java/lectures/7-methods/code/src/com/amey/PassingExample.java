package com.amey;

public class PassingExample {
    public static void main(String[] args) {
        String name = "Kunal Kushwaha"; //"Kunal Kushwaha" is an Object
        greet(name);                    // Pass by Value, in Java, there is nothing like Pass by Reference
    }

    static void greet(String naam) {
        System.out.println(naam);       // naam - Copy of the same reference variable "name"
    }
}
