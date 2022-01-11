package com.cursor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(3);
        integers.add(9);
        integers.add(11);
        integers.add(18);
        integers.add(20);
        integers.add(22);
        System.out.println(integers);
        for (int i = 0; i<integers.size();i++){
            if (integers.get(i) % 3 == 0){
             integers.remove(i);
             i--;
            }
        }
        System.out.println(integers);

    }

}
