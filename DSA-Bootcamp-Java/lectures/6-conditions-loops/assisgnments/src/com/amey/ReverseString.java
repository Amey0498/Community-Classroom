package com.amey;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Kindly enter String : ");
        String input = in.nextLine();
        String result = "";
        for (int i = (input.length() -1) ; i >= 0; i--) {
            result += input.charAt(i);
        }
        System.out.println(result);
        return;
    }
}
