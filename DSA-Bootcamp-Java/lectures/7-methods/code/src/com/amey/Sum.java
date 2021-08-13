package com.amey;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // calling the function
        sum();
        int valReturned = sumIntReturn();
        System.out.println("Return type function response : " + valReturned);

        // passing the values when you are calling the function in main
        int valParameterized = sumParameterized(3, 7);
        System.out.println("Parameterized function : "+ valParameterized);
    }

    static int sumParameterized(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    // return the value
    static int sumIntReturn(){
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;
        // DRY - don't repeat yourself
        System.out.print("Enter 1st number : ");
        num1 = in.nextInt();
        System.out.print("Enter 2nd number : ");
        num2 = in.nextInt();
        sum = num1 + num2;
        return sum;
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;
        // DRY - don't repeat yourself
        System.out.print("Enter 1st number : ");
        num1 = in.nextInt();
        System.out.print("Enter 2nd number : ");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("The sum of two numbers, " + num1 + " and " + num2 + " is: " + sum);
        return;
    }

    /*
    * Syntax :
    * <access modifier> <return type> name (no parameters or <parameters>){
    *   //body
    *   return statement;
    * }
    * */
}
