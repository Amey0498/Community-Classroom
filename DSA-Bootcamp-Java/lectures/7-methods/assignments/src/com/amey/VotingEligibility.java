package com.amey;

import java.util.Scanner;

public class VotingEligibility {
     public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Kindly enter your age : ");
        int age = in.nextInt();
        String voting = votingEligibility(age);
        System.out.println("You are "+ voting + " for voting");
        return;
    }
    static String votingEligibility(int x) {
        if( x >= 18) {
            return "eligible";
        }
        return "not eligible";
    }
}
