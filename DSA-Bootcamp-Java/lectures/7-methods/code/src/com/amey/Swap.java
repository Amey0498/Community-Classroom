package com.amey;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Kindly enter 2 numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();

        //swap numbers code
        int temp = a;
        a = b;
        b = temp;

        System.out.println("The 2 numbers are, " +  a + " and " + b);
        swap(a,b);
        System.out.println("Post swap method, the 2 numbers are, " +  a + " and " + b);

        String name = "Kunal Kushwaha"; // original name -> Kuanl Kushwaha
        System.out.println("The name value : " + name);
        changeName(name);               //
        System.out.println("Post changeName method, the name value : " +  name);

    }

    static void changeName(String name) {
        name = "Rahul Rana";            // name inside the function -> Rahul Rana
                                        // scoping - new "name" local variable is created
                                        // and assigned a literal value - "Rahul Rana"
    }
/*
*   1. primitives - int, short, char, byte - just passing value
*   2. Objects and String - passing the value of the reference variable(pointing to same object)
* */
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        // this change will be only valid in this function scope only
    }

}
