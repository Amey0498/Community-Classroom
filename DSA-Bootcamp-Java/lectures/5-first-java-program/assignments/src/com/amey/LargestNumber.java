package com.amey;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two numbers: ");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        System.out.print("Largest number of the two is : ");
        if(num1 > num2) {
            System.out.print(num1);
            return;
        } else if(num1 < num2) {
            System.out.println(num2);
            return;
        } else {
            System.out.println("Numbers are equal");
        }
    }
}
