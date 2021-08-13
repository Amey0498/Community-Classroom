package com.amey;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        //Q: Find the largest of the three numbers
        int max  =num1;
        if(num2 > max) {
            max =num2;
        }
        if (num3 > max) {
            max = num3;
        }
        System.out.println("Largest of the three numbers, " + num1 +", "+ num2 +" and "+ num3  + " : " + max);

        System.out.println("2nd method : ");
        int max2 = 0;
        if(num1>num2){
            max2 =  num1;
        } else {
            max2 = num2;
        }
        if(num3 > max2) {
            max2 = num3;
        }
        System.out.println("Largest of the three numbers, " + num1 +", "+ num2 +" and "+ num3  + " : " + max2);
        System.out.println("3rd method : ");
        int max3 = Math.max(num3, Math.max(num1, num2));
        System.out.println("Largest of the three numbers, " + num1 +", "+ num2 +" and "+ num3  + " : " + max3);
        System.out.println(Math.max(34, 57));

    }
}

