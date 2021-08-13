package com.amey;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter two numbers and an operator : ");
        float num1 =  in.nextFloat();
        float num2 = in.nextFloat();
//        System.out.println("Enter operation to be performed");
        String operator = in.next();

        if (operator.equals("+")){
            System.out.println(num1 + num2);
        } else if (operator.equals("-")) {
            System.out.println(num1 - num2);
        } else if (operator.equals("*")){
            System.out.println(num1 * num2);
        } else if (operator.equals("/")){
            System.out.println(num1/num2);
        } else if (operator.equals("%")){
            System.out.println(num1 % num2);
        } else {
            System.out.println("Invalid operation");
        };
    }
}
