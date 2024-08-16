package com.java.SetCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorExample {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
////        
//        int numb=1;
//        while(numb<=10) {
//        	 numbers.add(numb);
//        	 numb++;
//        	
//        }
//possible way
//        // Create a LinkedHashSet to store fruit names
//        LinkedHashSet<String> lhs = new LinkedHashSet<>();
//        String[] fruits = {"Apple", "Banana", "", "Cherry", "Date", null, "Elderberry"};
//
//        // Use a while loop to add non-empty elements from the array
//        int index = 0;
//
//        while (index < fruits.length) {
//            if (fruits[index] != null && !fruits[index].isEmpty()) {
//                lhs.add(fruits[index]); // Add non-empty fruit names to the LinkedHashSet
//            }
//            index++; // Move to the next index
//        }
        // Obtain a Spliterator for the list
        
        
        
        Spliterator<Integer> spliterator = numbers.spliterator();

        // Print characteristics
        System.out.println("Estimated size: " + spliterator.estimateSize());
        System.out.println("Characteristics: " + spliterator.characteristics());

        // Traverse the elements using the Spliterator
        System.out.println("Elements:");
        for(Integer in:numbers) {
        	System.out.println(in);
        	
        }
        //or
        
        spliterator.forEachRemaining(System.out::println);

        // Try splitting the Spliterator
        Spliterator<Integer> split = spliterator.trySplit();
        if (split != null) {
            System.out.println("Spliterator split into two:");
//            split.forEachRemaining(System.out::println);
        }
        System.out.println("remaining elements: ");
        spliterator.forEachRemaining(System.out::println);

    }
}
