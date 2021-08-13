package com.amey;

import java.util.Arrays;

public class PassingArraysInFunctions {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5, 9};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
        /*
        * Strings are immutable, arrays are mutable
        * */
    }
    static void change(int[] arr) {
        arr[0] = 99;
    }
}
