package com.amey;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        System.out.print("Kindly enter a number upto which you would like to print the series : ");
        int range = in.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 0; i < range; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b += temp;
        }
        return;
    }
}
