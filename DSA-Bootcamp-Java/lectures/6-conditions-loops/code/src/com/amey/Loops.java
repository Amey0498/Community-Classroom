package com.amey;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        /*
        * Syntax of for loops:
        * for (initialization; condition; increment) {
        *   //body
        * }
        *
        * */
        System.out.println("For Loop examples below: ");
        for (int num = 1; num <= 5 ; num++){
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Please enter a number : ");
        int n = in.nextInt();

        for (int num = 1; num <= n ; num++){
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("While Loop starts below");
        /*
        * Syntax :
        * while loops
        * while (condition) {
        *   //body
        * }
        * */
        int numWhile = 1;
        while( numWhile <= 5){
            System.out.print(numWhile + " ");
            numWhile +=1;
        }
        System.out.println();

        // do while
        /*
        * Syntax:
        * do {
        *   //body
        * }
        * while (condition);
        * */

        int numDoWhile = 1;
        System.out.println("Do while loop starts below");
        do {
            System.out.print(numDoWhile + " ");
            numDoWhile+=1;
        } while(numDoWhile <=5);
        System.out.println();
    }
}
