package com.amey;

import java.util.Scanner;

public class NcrNpr {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter two numbers : ");
        int n = in.nextInt();
        int r = in.nextInt();
        if (r > n) {
            System.out.print("Invalid input! n should be greater than r");
        }
        System.out.println("Select\n 1. for nPr \n 2. for nCr ");
        int choice = in.nextInt();
        int result = 0;
        switch (choice) {
            case 1 -> {
                result = (factorial(n) / factorial(n-r));
            }
            case 2 -> {
                result = (factorial(n) / (factorial(r) * factorial(n - r)));
            }
        }
        System.out.println("Result : " + result);
    }
    static int factorial(int num) {
        if( num == 0 )
            return 1;
        return (num * factorial(num-1));
    }
}
