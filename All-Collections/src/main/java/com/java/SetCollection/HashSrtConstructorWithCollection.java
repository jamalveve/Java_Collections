package com.java.SetCollection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.LinkedHashSet;
public class HashSrtConstructorWithCollection {

	public static void main(String[] args) {
//		Example 1: HashSet Constructor with a List
		  List<String> fruitList = new ArrayList<>();
	        fruitList.add("Apple");
	        fruitList.add("Banana");
	        fruitList.add("Cherry");
	        fruitList.add("Date");
	        fruitList.add("Elderberry");
	        fruitList.add("Fig");
	        fruitList.add("Grapes");
	        fruitList.add("Banana"); // Duplicate element

	        // Creating a HashSet from the List
	        HashSet<String> fruitSet = new HashSet<>(fruitList);

	        // Displaying the HashSet
	        System.out.println("Fruits in the HashSet: " + fruitSet);
	        System.out.println("Size of the HashSet: " + fruitSet.size());
	        
	        
//	     Example 2: HashSet Constructor with a Set
	        // Creating a LinkedHashSet of numbers
	        LinkedHashSet<Integer> numberSet = new LinkedHashSet<>();
	        numberSet.add(1);
	        numberSet.add(2);
	        numberSet.add(3);
	        numberSet.add(4);
	        numberSet.add(5);
	        numberSet.add(3); // Duplicate element

	        // Creating a HashSet from the LinkedHashSet
	        HashSet<Integer> hashSetFromNumbers = new HashSet<>(numberSet);

	        // Displaying the HashSet
	        System.out.println("Numbers in the HashSet: " + hashSetFromNumbers);
	        System.out.println("Size of the HashSet: " + hashSetFromNumbers.size());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
