package com.amey;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // matrix
        /*
        *  1  2  3
        *  4  5  6
        *  7  8  9
        * writing number of rows(*r*) is mandatory at initialization
        * <datatype>[][] variable_name = new <datatype>[*r*][c]
        * */
        int[][] arr = new int[3][2];

         int[][] arr2 = {
                 {1, 2, 3},
                 {4, 5, 6},
                 {7, 8, 9}
         };
         for (int i = 0 ; i < arr2.length ; i++) {
             System.out.println(Arrays.toString(arr2[i]));
         }
        System.out.println("Kindly enter 6 numbers");
         // input
        for (int row = 0 ; row < arr.length ; row++) {
            // for each column in every row
            for (int col = 0; col < arr[row].length; col++){
                arr[row][col] = in.nextInt();
            }
        }

        // output
        for (int row = 0 ; row < arr.length ; row++) {
            // for each column in every row
            for (int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " ");;
            }
            System.out.println();
        }

        for (int row = 0 ; row < arr.length ; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        // enhanced for loop
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
