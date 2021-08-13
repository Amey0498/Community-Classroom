package com.amey;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Kindly enter a number : ");
        int num = in.nextInt();
        System.out.println(num + primeornot(num));
    }
    static String primeornot ( int num ) {
        String retVal = " is ";
        int c = 2;
        if (num == 1) {
            return retVal + "neither prime nor composite number";
        }
        while (c * c <= num) {
            if( num % c == 0) {
                return retVal + "not a prime number";
            }
            c++;
        }
        if(c*c > num ) {
            return retVal  + "a prime number";
        }
        return "";
    }
}
