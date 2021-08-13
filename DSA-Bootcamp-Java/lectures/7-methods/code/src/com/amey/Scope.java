package com.amey;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Kunal";
//        System.out.println(num);
        {
            // Block scope
            a = 78;
            int c = 55;
            name= "Rahul";
            /*
            * 1. cannot initialize variables existing in the same function
            * 2. values can be changed of the existing variables -> reassign the original ref variable to some other value
            * 3. values initialized in the block, remain in the block
            * */
        }
        System.out.println(a);
        System.out.println(name);
        /*
        * System.out.println(c);    // cannot be used outside the block
        * */

        // scoping in for loops
        for (int i = 0; i <4 ; i++) {
            System.out.print(i + " ");
            int num =90;
            /*
            * int a = 22;
            * cannot be initialized as already declared ouside for loop
            * */
        }
        /*
        * System.out.println(i); variable "i" cannot be accessed outside for loop
        * */

    }

    static void random() {
//        System.out.println(a);
        int num = 67;
        System.out.println(num);
    }
}
