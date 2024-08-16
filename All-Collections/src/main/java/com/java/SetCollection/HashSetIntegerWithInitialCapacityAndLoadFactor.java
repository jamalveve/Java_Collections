package com.java.SetCollection;
import java.util.HashSet;

public class HashSetIntegerWithInitialCapacityAndLoadFactor {
    public static void main(String[] args) {
        // Create a HashSet with an initial capacity of 20 and a load factor of 0.5
        HashSet<Integer> numbers = new HashSet<>(20, 0.5f);

        // Adding elements to the HashSet
        for (int i = 1; i <= 15; i++) {
            numbers.add(i);
        }

        // Displaying the HashSet
        System.out.println("Numbers in the HashSet: " + numbers);
        System.out.println("Size of the HashSet: " + numbers.size());

        // Checking if a specific number exists
        System.out.println("Does the HashSet contain 10? " + numbers.contains(10));

        // Removing an element
        numbers.remove(10);
        System.out.println("After removing 10: " + numbers);
        System.out.println("Size of the HashSet after removing 10: " + numbers.size());
    }
}
