package com.amey;

public class MaxWealth {
    public static void main(String[] args) {

    }
    public int maximumWealth (int [][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            // for every new person, take a new sum
            int rowSum = 0;
            for (int element : ints) {
                rowSum += element;
            }
            // now we have sum of accounts of person
            // now check with overall ans
            if (rowSum > ans) {
                ans = rowSum;
            }
        }
        return ans;
    }
}
