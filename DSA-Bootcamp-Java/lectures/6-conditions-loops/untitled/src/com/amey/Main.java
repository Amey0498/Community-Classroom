package com.amey;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a fruit : ");
        String fruit = in.next();
        fruit = fruit.toLowerCase(Locale.ROOT);
        System.out.println("If Statement Result");
        if(fruit.equals("mango")) {
            System.out.println("King of fruits");
        }
        if (fruit.equals("apple")) {
            System.out.println("Sweet red fruit");
        }
        if(fruit.equals("orange")) {
            System.out.println("Round fruit");
        }
        if(fruit.equals("grapes")) {
            System.out.println("Small Fruit");
        }

        String a = "Kunal";
        String b = "Kunal";
        // checks reference of the string
        System.out.println(a == b);
        // checks the value of the string
        System.out.println(a.equals(b));

        // switch statement
        /*
        * Syntax :
        * switch (expression) {
        * case one:
        *   // do something
        *   break;
        * case two:
        *   // do something
        *   break;
        * default:
        *   // do something
        * }
        * */
        System.out.println("Switch Statement Result begins here");
        switch (fruit) {
            case "mango" :
                System.out.println("King of fruits");
                break;
            case "apple" :
                System.out.println("Sweet red fruit");
                break;
            case "orange" :
                System.out.println("Round fruit");
                break;
            case "grapes" :
                System.out.println("Small fruit");
                break;
            default :
                System.out.println("Please enter a valid fruit");
        }
        System.out.println("Enhanced Switch Statement begins here");
        switch (fruit) {
            case "mango" -> System.out.println("King of fruits");
            case "apple" -> System.out.println("Sweet red fruit");
            case "orange" -> System.out.println("Round fruit");
            case "grapes" -> System.out.println("Small fruit");
            default -> System.out.println("Please enter a valid fruit");
        }

        System.out.print("Enter a number : ");
        int day = in.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid number of day");
        }
        switch(day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
            case 6:
            case 7:
                System.out.println("Weekend");
            default:
                System.out.println("Invalid number of day");
        }
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Invalid number of day");
        }
        return;
    }
}
