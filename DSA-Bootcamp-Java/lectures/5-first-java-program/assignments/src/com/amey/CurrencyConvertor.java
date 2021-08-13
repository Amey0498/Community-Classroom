package com.amey;

import java.util.Scanner;

public class CurrencyConvertor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter rupees : ");
        float inr = in.nextFloat();
        System.out.println("Conversion of " + inr + " rupees into US Dollars :  " + inr*0.013);
    }
}
