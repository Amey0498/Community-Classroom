package com.amey;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Kindly enter two numbers : ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println("Product of two numbers, " + num1 + " and " + num2 + " is: " + product(num1, num2));
        return;
    }
    static int product(int x, int y) {
        return x*y;
    }
}
