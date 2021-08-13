package com.amey;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter principal, interest rate and time: ");
        float p = in.nextFloat();
        float i = in.nextFloat();
        int t = in.nextInt();

        System.out.println("Simple interest for " + p + " for period of " + t + " years at an interest rate of " + i + " is: " + (p*i*t)/100);
    }
}
