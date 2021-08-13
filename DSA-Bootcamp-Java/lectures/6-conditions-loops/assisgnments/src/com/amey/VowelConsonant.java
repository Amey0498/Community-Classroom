package com.amey;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Kindly enter a alphabet : ");
        char ch = in.next().trim().charAt(0);
        switch (ch) {
            case 'a','e','i','o','u' -> System.out.println("Vowel");
            default -> System.out.println("Consonant");
        }
        return;
    }
}
