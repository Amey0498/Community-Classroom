package com.amey;

import java.util.Scanner;

public class SumAll {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter a number : ");
        int input = in.nextInt();
        while(input != 0){
            sum+= input;
            System.out.println("Enter a number : ");
            input = in.nextInt();
        }
        System.out.println("Total sum = " + sum);
        return;
    }
}
