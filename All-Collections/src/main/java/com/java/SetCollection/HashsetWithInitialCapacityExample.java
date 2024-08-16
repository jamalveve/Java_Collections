package com.java.SetCollection;

import java.util.HashSet;

public class HashsetWithInitialCapacityExample {

	public static void main(String[] args) {

		HashSet<String> fruits = new HashSet<>(10);

        // Adding elements to the HashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        // Displaying the HashSet
        System.out.println("Fruits in the HashSet: " + fruits);

        // Adding more elements
        fruits.add("wallnut");
        fruits.add("Fig");
        fruits.add("pumpkin");

        // Displaying the updated HashSet
        System.out.println("Updated Fruits in the HashSet: " + fruits);
        
        // Adding few more elements
        fruits.add("kismis");
        fruits.add("grapes");
        fruits.add("cashew");
        fruits.add("bhadham");
        fruits.add("pistah");

        // Displaying the updated HashSet
        System.out.println("Updated second time Fruits in the HashSet: " + fruits);
        System.out.println(fruits.size());
        System.out.println(fruits);
        
        
	}

}
