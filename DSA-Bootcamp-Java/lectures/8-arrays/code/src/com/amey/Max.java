package com.amey;

import java.util.ArrayList;
import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 23,49, 22, 18};
        System.out.println("Maximum item in the array : "+max(arr));
        System.out.println("Maximum item in range in the array : "+maxInRange(arr,1, 4));
    }
    static int maxInRange(int[] arr, int start, int end) {
        if( arr.length == 0 ) return -1;
        if(start > end) return -1;
        int maxVal = arr[start];
        for (int i = start+1; i <= end ; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    static int max(int[] arr) {
        if ( arr.length == 0 )
            return -1;
        int maxVal = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
