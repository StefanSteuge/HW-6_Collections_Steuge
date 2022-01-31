package com.cursor;

import java.util.ArrayList;

public class Fruit {

    public static void main(String[] args) {

        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Nuts");
        fruit.add("Avocado");
        fruit.add("Banana");
        fruit.add("Apple");
        fruit.add("Coconuts");
        fruit.add("Mango");
        fruit.add("Pineapple");
        fruit.add("Lemon");
        fruit.add("Chubakabra");

        System.out.println(fruit);
        for (int i = 0; i < fruit.size(); i++) {
            if (fruit.get(i).equals("Orange")) {
                fruit.set(i, "Grapefruit");
                System.out.println(fruit);
            } else {
                System.out.println("That value not present!");
                break;
            }
        }
    }
}