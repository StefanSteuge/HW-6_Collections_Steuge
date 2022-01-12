package com.cursor;

import java.util.ArrayList;

public class ArrayData {

    public static void main(String[] args) {
        ArrayList<Double> data = new ArrayList<>();
        ArrayList<Double> data2 = new ArrayList<>();
        data.add(0, 5.2);
        data.add(1, 4.6);
        data.add(2, 8.1);
        data.add(3, 0.3);
        data.add(4, 14.2);
        data.add(5, 9.7);
        data2.add(0, 1.1);
        data2.add(1, 6.4);
        data2.add(2, 5.2);
        data2.add(3, 9.7);
        data2.add(4, 7.5);
        data2.add(5, 13.5);
        System.out.println(data);
        System.out.println(data2);
        int similarElement = 0;
        for (double i : data) {
            for (double j : data2) {
                if (i == j) {
                    similarElement++;
                }
            }
        }
        System.out.println("There are " + similarElement + " similar elements");
    }
}



