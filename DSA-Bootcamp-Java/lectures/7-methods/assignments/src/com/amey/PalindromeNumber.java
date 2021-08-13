package com.amey;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Kindly enter a number with atleast two digits : ");
        int num = in.nextInt();
        int copynum = num;
        if(copynum/10 == 0) {
            System.out.println("Input entered is a single digit number");
            return;
        }
        System.out.println(num + palindrome(num));
    }
    static String palindrome(int x) {
        int original = x;
        int result= 0;
        while (x > 0 ){
            result = result*10 + (x%10);
            x/=10;
        }
        /*
        System.out.println(result + " "+ original);
         */
        if ( result == original) {
            return " is a palindrome.";
        }
        return " is not a palindrome.";
    }
}
