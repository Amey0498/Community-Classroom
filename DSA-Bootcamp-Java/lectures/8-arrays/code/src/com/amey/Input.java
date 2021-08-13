package com.amey;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] intArr = new int[5];
        intArr[0] = 23;
        intArr[1] = 233;
        intArr[2] = 273;
        intArr[3] = 43;
        intArr[4] = 293;
        System.out.println(intArr[3]);
        System.out.println("Kindly provide input of 5 numbers to store : ");
        // input using for loops
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = in.nextInt();
        }
        // foreach loop or enhanced for loop
        for (int num : intArr) {            // for every element in the array, print the element
            System.out.print(num + " ");    // here num represents element of the array
        }
        System.out.println();
        // eassier way to print
        System.out.println(Arrays.toString(intArr));

        // array of Objects
        String[] strArr = new String[4];
        System.out.println("Kindly enter 4 strings to store : ");
        for (int i = 0 ; i < strArr.length ; i++) {
            strArr[i] = in.next();
        }
        System.out.println(Arrays.toString(strArr));

        // modify
        strArr[1] = "allow";
        System.out.println(Arrays.toString(strArr));
    }
}
