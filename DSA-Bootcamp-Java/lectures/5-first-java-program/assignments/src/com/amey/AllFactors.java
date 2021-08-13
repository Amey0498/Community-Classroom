package com.amey;

import java.util.Scanner;

public class AllFactors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int input = in.nextInt();
        int c = 1;
        while (c*c <= input) {
            if(input%c==0) {
                System.out.println(c + " " + input/c);
            }
            c= c+1;
        }
    }
}
