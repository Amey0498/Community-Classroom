package com.amey;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Q: Store a roll number
        int rno = 19;
        // Q: Store a person's name
        String name = "Kunla Kushwaha";
        // Q: Store 5 roll numbers
        /*
        Hard way to store 5 roll numbers
         */
        int rno1 = 23;
        int rno2 = 24;
        int rno3 = 26;
        int rno4 = 33;
        int rno5 = 54;

        /*
        * Syntax :
        * <datatype>[] variable_name = new <datatype>[size];
        * Store 5 roll numbers :
        * */
        int[] rnos = new int [5];
        //or directly
        int[] rnos2 = {23,55,22,12, 42};

        int[] rnos3;           // declaration of array. defination in the stack
        rnos3 = new int[6];     // initialization actual object is created in the memory
        System.out.println(rnos3[2]);
        /*
        * Compile time      Run time(dynamic memory allocation)
        * int[] arr     =   new int[5];
        * in c & cpp    ->  pointers are present and hence there is continuous blocks of memory
        * in java       ->  cannot get addresses, depends on JVM if the blocks are going to be continuous
        * Java Language Specification - array objects maybe or may not be continuous
        * 1. array objects are in the heap memory
        * 2. heap objects are not necessarily continuous
        * 3. Dynamic Memory Allocation
        * Indices of an array -
        * starts from zero
        * "new" keyword is used to create an object
        * null is a special literal used for objects apart from primitives
        * */

        String[] arrString = new String[5];
        System.out.println(arrString[2]);
    }
}
