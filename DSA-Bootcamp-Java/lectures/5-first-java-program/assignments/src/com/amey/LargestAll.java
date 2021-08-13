package com.amey;

import java.util.Scanner;

public class LargestAll {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int input = in.nextInt();
        int largestAll = input;
        while(input != 0){
            if(input > largestAll){
                largestAll = input;
            }
            System.out.println("Please enter a number : ");
            input = in.nextInt();
        }
        System.out.println("Largest Number of all the inputs : " + largestAll);
        return;
    }
}
