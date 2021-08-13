package com.amey;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Kindly enter a number : ");
        int num = in.nextInt();
        int inputNum = num;
        System.out.println();
        int resultNum = 0;
        while(num > 0 ){
            resultNum = (resultNum*10) + (num%10);
            num = num/10;
        }
        System.out.println("The reverse of input number " + inputNum + " is " + resultNum);

    }
}
