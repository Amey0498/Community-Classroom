package com.amey;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Kindly enter a number and the power which you would like to get : ");
        int num = in.nextInt();
        int pow = in.nextInt();
        int result = 1;
        for (int i =1; i <= pow ; i++ ) {
            result*=num;
        }
        System.out.println("Result of entire number : " + result);
        return;
    }
}
