package com.amey;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Kindly enter your marks : ");
        double marks = in.nextDouble();
        System.out.println("You have received this grade : " + getGrade(marks));
        return;
    }
    static String getGrade(double marks) {
        if(marks > 100 ) {
            return "Invalid marks. Kindly enter marks less than or equal to 100";
        }
        if(marks > 90 && marks <= 100) {
            return "AA";
        }
        if(marks > 80 && marks <= 90) {
            return "AB";
        }
        if(marks > 70 && marks <= 80) {
            return "BB";
        }
        if(marks > 60 && marks <= 70) {
            return "BC";
        }
        if(marks > 50 && marks <= 60) {
            return "CD";
        }
        if(marks > 40 && marks <= 50) {
            return "DD";
        }
        return "FAIL";
    }
}
