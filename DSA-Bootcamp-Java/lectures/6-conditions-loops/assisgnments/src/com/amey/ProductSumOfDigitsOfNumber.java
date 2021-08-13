package com.amey;

import java.util.Scanner;

public class ProductSumOfDigitsOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Kindly enter a number : ");
        int num = in.nextInt();
        int prodRes = 1;
        int sumRes = 0;
        int n = num;
        while(n > 0) {
            prodRes *= n%10;
            sumRes += n%10;
            n/=10;
        }
        System.out.println("Result : " + (prodRes-sumRes));
        return;
    }
}
