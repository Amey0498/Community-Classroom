package com.amey;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = input.nextInt();

        int c = 2;
        if (n <= 1){
            System.out.println("Neither prime nor composite");
            return;
        }
        while(c*c < n) {
            if(n % c ==0){
                System.out.println("Not Prime");
                return;
            } else {
                c = c + 1;
            }
        }
        if (c*c > n) {
            System.out.println("Prime number");
        }
    }
}
