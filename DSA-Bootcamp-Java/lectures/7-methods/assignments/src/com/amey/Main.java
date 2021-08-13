package com.amey;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in  = new Scanner(System.in);
        System.out.print("Kindly enter a number: ");
        int input = in.nextInt();
        String result = evenodd(input);
        System.out.println(input + " is "+result);
    }
    static String evenodd(int num) {
        if(num % 2==0) {
            return "Even";
        }
        return "Odd";
    }
}
