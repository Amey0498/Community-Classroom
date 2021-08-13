package com.amey;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Kindly enter a number : ");
        int num = in.nextInt();
        int value = num;
        int result = 0 ;
        while( value > 0 ) {
            result += (value%10)*(value%10)*(value%10);
            value/=10;
        }
        if ( num == result ) {
            System.out.println( num + " is an Armstrong number ");
            return;
        }
        System.out.println(num + " is not an Armstrong Number ");
    }
}
