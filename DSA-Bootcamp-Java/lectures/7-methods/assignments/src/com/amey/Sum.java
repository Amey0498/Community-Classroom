package com.amey;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println("Sum of two numbers, " + num1 + " and " + num2 + " is: " + sum(num1, num2));
        return;
    }

    static int sum(int x, int y) {
        return x+y;
    }
}
