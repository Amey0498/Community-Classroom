package com.amey;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Kindly provide two numbers as input: ");
        int num1 = in.nextInt();
        int num2= in.nextInt();
        int minResult = min(num1, num2);
        int maxResult = max(num1, num2);
        System.out.println("Max : " + maxResult + " Min : " + minResult);
    }
    static int max(int x, int y){
        if(x > y) {
            return x;
        } else if (y > x) {
            return y;
        } else return -1;
    }
    static int min(int x, int y){
        int value = max(x,y);
        if (value == -1) {
            return -1;
        }
        if(value == x ){
            return y;
        }
        return x;
    }
}
