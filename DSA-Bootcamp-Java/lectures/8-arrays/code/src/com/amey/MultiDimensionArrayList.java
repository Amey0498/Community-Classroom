package com.amey;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> listOfList = new ArrayList<>();

        // initialization
        for (int i =0 ; i < 3 ; i++) {
            listOfList.add(new ArrayList<>());
        }

        for (int i =0 ; i < 3 ; i++ ){
            for(int j = 0 ; j < 3 ; j++) {
                listOfList.get(i).add(in.nextInt());
            }
        }
        System.out.println(listOfList);
    }
}
