package com.amey;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Take input from user till user does not press X or r
        int ans = 0 ;
        while (true) {
            // take operator as input
            System.out.print("Enter the operator : ");
            char op = in.next().trim().charAt(0);
//            System.out.println();
            int num1 = 0 ,num2 = 0 ;
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // input two numbers
                System.out.print("Enter two numbers: ");
                num1 = in.nextInt();
                num2 = in.nextInt();
//                System.out.println();
                if(op == '+') {
                    ans = num1 + num2;
                }
                if(op == '-') {
                    ans = num1 - num2;
                }
                if(op == '*') {
                    ans = num1 * num2;
                }
                if(op == '/') {
                    if(num2 != 0){
                        ans = num1 / num2;
                    }
                }
                if(op == '%') {
                    ans = num1 % num2;
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid operation!! Please try again");
            }
            System.out.println("The result obtained for the operation " + op + " for the two numbers, " + num1 + " and " + num2 + " is: " + ans);
        }
        return;
    }
}
