package com.amey;

import java.util.Scanner;

public class ReturnString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String message = greet();
        System.out.println(message);

        System.out.print("Kindly enter your name : ");
        String personalizedMessage = myGreet(in.nextLine());
        System.out.println(personalizedMessage);
    }

    static String myGreet(String name){
        String message = "Hello " + name;
        return message;
    }

    static  String greet(){
        String greeting = "How are you?";
        return greeting;
    }
}
