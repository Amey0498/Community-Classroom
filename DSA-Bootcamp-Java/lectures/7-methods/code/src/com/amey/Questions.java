package com.amey;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Kindly enter a number to check if it is a prime number or not: ");
        int num1 = in.nextInt();
        System.out.println(num1+ " is Prime : " + isPrime(num1));
        System.out.print("Kindly enter a number to check if Armstrong number or not : ");
        int num2 = in.nextInt();
        System.out.println(num2 + " is Armstrong Number : " + isArmstrong(num2));

        for (int numLoop = 100 ; numLoop < 1000 ; numLoop++){
            if (isArmstrong(numLoop)) {
                System.out.print(numLoop + " ");
            }
        }
        return;
    }

    // print all the 3 digit Armstrong Number
    static int armstrongNumberProcessingFunc(int n) {
        int original = n;
        int sum = 0;
        while (n > 0 ) {
            int rem = n % 10;
            sum += Math.pow(rem, 3);
            n = n/10;
        }
        return (sum == original) ? 1 : 0;
    }

    static boolean isArmstrong(int n) {
        boolean bool;
        bool = armstrongNumberProcessingFunc(n) == 1 ? true : false ;
        return bool;
    }
    // prints true if prime and false if not prime
    static boolean isPrime (int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while ( c * c <= n ) {
            if (n % c == 0 ) {
                return false;
            }
        }
        return c * c > n;
    }
}
