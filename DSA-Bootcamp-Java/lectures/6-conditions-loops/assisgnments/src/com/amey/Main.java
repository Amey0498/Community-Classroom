package com.amey;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner (System.in);
        System.out.print("Kindly enter a radius value : ");
        double radius = in.nextDouble();
        System.out.println("Area of the circle : " + Math.PI*radius*radius);
        return;
    }
}
