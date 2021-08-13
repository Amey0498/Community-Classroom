package com.amey;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int factorial = 1;
        System.out.print("Please enter a number: ");
        int factNum = in.nextInt();
        for (int i = 2; i <= factNum; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + factNum + " is: " + factorial);

    }
}
