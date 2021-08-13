package com.amey;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a alphabet : ");
        // trim - removes extra space
        // charAt gives character at that index
        char ch = in.next().trim().charAt(0);

        if(ch >= 'a' && ch <='z') {
            System.out.println("Alphabet is lowercase");
            return;
        } else if(ch >= 'A' && ch <= 'Z') {
            System.out.println("Alphabet is UPPERCASE");
            return;
        }
    }
}
