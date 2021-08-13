package com.amey;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float numX = input.nextFloat();
        /*
        * automatic type conversion
        * 1.  two types should be compatible
        * 2.  destination type should be greater than source type
        */
        System.out.println(numX);

        /*
        * type casting - narrowing down
        * */
        int numY = (int)(67.56f);
        System.out.println(numY);
        /*
        * automatic type promotion in expressions
        */

        int aX = 257;
        byte bX = (byte) aX;
        System.out.println(bX);

        byte aY = 40;
        byte bY = 50;
        byte cY = 100;
        int dY = (aY * bY) / cY;
        System.out.println(dY);

        int charValue =  'c';
        System.out.println(charValue);

        /*
        * 1. short and byte value is converted to int
        * 2. biggest datatype is assigned to final result
        * */

        byte bZ = 42;
        char cZ = 'a';
        short sZ = 1024;
        int iZ = 50000;
        float fZ = 5.67f;
        double dZ = 0.111234;
        double resultZ = (fZ * bZ) + (iZ /cZ) - (dZ * sZ);
        System.out.println((fZ * bZ) +" "+ (iZ /cZ) +" "+ (dZ * sZ));
        System.out.println(resultZ);

    }
}
