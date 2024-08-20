package com.java.ListCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.random.RandomGenerator;

public class CollectionClassMethods {

	public static void main(String[] args) {
		// Create and populate a list of integers
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(5);
		numbers.add(7);
		numbers.add(9);

		List<String> list = new ArrayList<>();
		list.add("apple");
		list.add("banana");

		list.add("Grape");
		list.add("cherry");

		list.add("date");
		list.add("fig");
		
		 List<String> setString=new LinkedList<>();
		 setString.add("7");
		 setString.add("hekeo");
		 setString.add("56");
		 setString.add("gygyg");
		 
		 Collections.copy(list, setString);//doubt
		 System.out.println("copying all the elements from second list to firts list"+ list);
		 
		 // Create a destination list with enough space
	        List<Object> destList = new java.util.ArrayList<>(java.util.Arrays.asList(new Object[6]));
	        
			 
			 Collections.copy(destList, list);
			 System.out.println("copying to destlist:"+destList);
		// // Correctly sorting the list in reverse order
		Collections.sort(numbers, Collections.reverseOrder());
		// or
//        Collections.sort(numbers);
		System.out.println(numbers);
		// Sort the list (in this example, the list is already sorted)
		// Collections.sort(numbers); // Not needed here as the list is already sorted

		Comparator<String> comparator = String.CASE_INSENSITIVE_ORDER;
		String keyToFind = "cherry";
		int index1 = Collections.binarySearch(list, keyToFind, comparator);
//		System.out.println("Index of '" + keyToFind + "': " + index1);// doubt
		// Demonstrating search results
		if (index1 >= 0) {
			System.out.println("'" + keyToFind + "' found at index: " + index1);
		} else {
			System.out.println("'" + keyToFind + "' not found. Insertion point: " + (-index1 - 1));
		} // doubt
			// Perform binary search way 1 for the element 5
		int index = Collections.binarySearch(numbers, 5);
		// Output the result
		if (index >= 0) {
			System.out.println("Element 5 found at index: " + index);
		} else {
			System.out.println("Element 5 not found. Insertion point: " + (-index - 1));
		}

		// Search for an element that is not in the list
		index = Collections.binarySearch(numbers, 6);

		if (index >= 0) {
			System.out.println("Element 6 found at index: " + index);
		} else {
			System.out.println("Element 6 not found. Insertion point: " + (-index - 1));
		}

		// reverse operation
		Collections.reverse(list);
		System.out.println("reverse printed" + list);

		// Shuffle operation
		Collections.shuffle(list);
		System.out.println("shuffled and printed" + list);

		Random random = new Random(12345);
		Collections.shuffle(list, random);

		System.out.println("shuffled along with ramdom and printed" + list);

		list = new ArrayList<>(List.of("apple", "banana", "Grape", "cherry", "date", "fig")); // reset the list
		Collections.shuffle(list, random);
		System.out.println("Shuffled list with seed 12345 (again): " + list);// doubt

     //   RandomGenerator randomGenerator = RandomGeneratorFactory.of("L64X128MixRandom").create();
		
		//swap method
		
		Collections.swap(list,2,4);
		System.out.println("swaping the list"+list);
		 Integer[] stringArray = {1, 10,3,78};
		 
		 
		 Collections.fill(list, "orange");
		 System.out.println("after filling the elemmnt in list"+list);
		 
		Collections.synchronizedList(list);
		System.out.println("printing the synchronised list"+list);
			 
		 
	
		 
		
		
		
		
		
		
		
		
		
	}

}
