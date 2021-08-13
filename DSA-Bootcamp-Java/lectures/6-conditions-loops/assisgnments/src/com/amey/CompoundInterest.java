package com.amey;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of principal, number of years, number of times the interest is compounding, rate of interest annually : ");
        double prin = in.nextDouble();
        double years = in.nextDouble();
        double numberTimes = in.nextDouble();
        double rateInterest = in.nextDouble();
        double newPrinc = prin;
        double compoundInterest = 0;
        /*
        * Compound Interest -
        * P' = P(1+(R/n))^nt
        * P - principal
        * P' - New Principal
        * r - rate of interest
        * n - number of times interest compounding
        * t - number of years
        * CI = P' -P
        * */

        for (int i = 0 ; i < years ; i++ ) {
            newPrinc *= Math.pow((1 + rateInterest / numberTimes), numberTimes);
        }
        System.out.println(newPrinc - prin);

    }
}
