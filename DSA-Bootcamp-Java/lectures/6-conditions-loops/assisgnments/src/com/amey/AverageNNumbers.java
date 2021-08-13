package com.amey;

import java.util.Scanner;

public class AverageNNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Kindly enter a number : ");
        int n = in.nextInt();
        System.out.println("Kindly enter " + n + " numbers : ");
        double avg = 0;
        for (int i = 1; i <= n ; i++ ) {
            int num = in.nextInt();
            avg = (avg*(i-1)) + num;
            avg /= i;
        }
        System.out.println("The average of " + n + " numbers is : " + avg);
        return;
    }
}
