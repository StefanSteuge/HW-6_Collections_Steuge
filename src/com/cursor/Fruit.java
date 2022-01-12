package com.cursor;

import java.util.ArrayList;

public class Fruit {

    public static void main(String[] args) {
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Orange");
        fruit.add("Avocado");
        fruit.add("Banana");
        fruit.add("Apple");
        fruit.add("Coconuts");
        fruit.add("Mango");
        fruit.add("Pineapple");
        fruit.add("Lemon");
        fruit.add("Chubakabra");
        if (fruit.contains("Orange")) {
            System.out.println(fruit);
            fruit.set(0, "Grapefruit");
            System.out.println(fruit);
        } else {
            System.out.println("That value not present!");
        }
    }
}