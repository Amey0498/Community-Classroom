package com.amey;

import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Kindly enter a number : ");
        int num = in.nextInt();
        int number = num;
        System.out.println("Kindly enter a digit from the above number you would like to count : ");
        int digit = in.nextInt();
        int count = 0 ;
        while ( num > 0 ) {
            if( num%10 == digit ) {
                count++;
            }
            num = num/10;
        }
        System.out.println("Number of times " + digit + " occurs in the input number " + number + " : " + count);
    }
}
