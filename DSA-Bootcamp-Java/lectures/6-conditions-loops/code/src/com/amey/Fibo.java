package com.amey;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        // Q: Find the nth Fibonacci Number
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the nth position which you want to know : ");
        int n = in.nextInt();
        int p = 0;
        int i = 1;
        int count = 2;

        while(count <= n){
            int temp = i;
            i = i + p;
            p = temp;
            count++;
        }
        System.out.println(i);
    }
}

