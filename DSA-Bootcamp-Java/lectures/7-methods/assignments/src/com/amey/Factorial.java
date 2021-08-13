package com.amey;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Kindly enter a number to know its factorial :  ");
        int num = in.nextInt();
        System.out.println("Factorial of " + num + " : " + factorial(num));
    }
    static int factorial(int num) {
        while (num > 0){
            return num*factorial(num-1);
        }
        return 1;
    }
}
