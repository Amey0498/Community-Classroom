package com.amey;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Kindly enter a number : ");
        int num = in.nextInt();
        int original = num;
        int result = 0;
        while ( num > 0 ) {
            result = result*10 + num%10;
            num/=10;
        }
        if (original == result ) {
            System.out.println(original + " is a palindrome number ");
            return;
        }
        System.out.println(original + " is not a palindrome number ");
        return;
    }
}
