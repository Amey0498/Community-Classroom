package com.amey;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Kindly enter a number to get its factoral : ");
        int num = in.nextInt();
        int i = 1;
        int factorial = 1;
        while( i <= num) {
            factorial *= i;
            i++;
        }
        System.out.println("Factorial of number, " + num + " is : " + factorial);
    }
}
