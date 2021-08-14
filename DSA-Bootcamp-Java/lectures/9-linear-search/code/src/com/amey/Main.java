package com.amey;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner (System.in);
        System.out.print("Kindly enter size of array : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Kindly enter an array");
        for(int i = 0 ; i < n ; i++ ) {
            arr[i] = in.nextInt();
        }
        System.out.print("Kindly enter a number to be searched : ");
        int target = in.nextInt();
        System.out.print(Arrays.toString(arr));
        System.out.print("Number, " + target + " is found at index : " +linearSearch(arr, target));
    }
    // search the target and return the index
    static int linearSearch(int[] arr, int target) {
        if(arr.length == 0 ) {
            return -1;
        }
        for (int index =0 ; index < arr.length ; index++) {
            if(arr[index]==target) {
               return index;
            }
        }
        return -1;
    }
    // search the target and return the element
    static int linearSearch2(int[] arr, int target) {
        if(arr.length == 0 ) {
            return -1;
        }
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }
    static boolean linearSearch3(int[] arr, int target) {
        if(arr.length == 0 ) {
            return false;
        }
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }
}
