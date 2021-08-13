package com.amey;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Kindly input a number : ");
        int num = in.nextInt();
        int c = 2;
        int result = 1;
        for ( ; c < num ; c++ ) {
            if( num % c == 0 ) {
                result += c;
            }
        }
        if(result == num) {
            System.out.println( num + " is a Perfect Number ");
            return;
        }
        System.out.println( num + " is not a Perfect Number ");
        return;
    }
}
