package com.java.ListCollection;

import java.awt.geom.Line2D;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		// Create a LinkedList of integers
		LinkedList<Integer> linkedList = new LinkedList<>();

		// Add elements to the LinkedList
		linkedList.add(10); // Add to the end
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(50);
		linkedList.add(100);

		// Add elements at specific positions
		linkedList.addFirst(0); // Add to the beginning
		linkedList.addLast(40); // Add to the end
		linkedList.add(3, 999);// add at index
		// Print the LinkedList
		System.out.println("LinkedList: " + linkedList);

		// Access elements
		Integer firstElement = linkedList.getFirst(); // Get first element
		Integer lastElement = linkedList.getLast(); // Get last element
		System.out.println("First Element: " + firstElement);
		System.out.println("Last Element: " + lastElement);

		// Remove elements
		linkedList.removeFirst(); // Remove the first element
		linkedList.removeLast(); // Remove the last element
		linkedList.remove(1); // Remove element at index 1 (second position)

		// Print the LinkedList after removals
		System.out.println("LinkedList after removals: " + linkedList);

		// Iterate over the LinkedList
		System.out.println("Iterating over the LinkedList:");
		for (Integer element : linkedList) {
			System.out.println(element);
		}

		// Check if the LinkedList contains an element
		boolean contains20 = linkedList.contains(20);
		System.out.println("Contains 20: " + contains20);

		// Get the size of the LinkedList
		int size = linkedList.size();
		System.out.println("Size of LinkedList: " + size);

		LinkedList<String> list2 = new LinkedList<>();

		// Add elements to the LinkedList
		list2.add("One");
		list2.add("Two");
		list2.add("Three");

// linkedList.addAll(3,list2);
//                linkedList.addAll(list2);//ot pssible

		LinkedList<Integer> linkedListint = new LinkedList<>();

		// Add elements to the LinkedList
		linkedListint.add(10); // Add to the end
		linkedListint.add(20);
		linkedListint.add(30);
		linkedList.addAll(linkedListint); // pssible

		System.out.println("new list" + linkedListint);
		System.out.println("existing list" + linkedList);

		linkedList.addAll(5, linkedListint);
		System.out.println("existung list" + linkedList);

		System.out.println("getting the elemente at index " + linkedListint.get(1));
		System.out.println("setting the elemente at index " + linkedListint.set(2, 1000));
		System.out.println("now updated list" + linkedListint);
//peek,poll,offer

//		Retrieves, but does not remove, the head (first element) of the list. Returns null if the list is empty.
		System.out.println("peeking the elemnt" + linkedList.peek());
		System.out.println("updated list" + linkedList);

		System.out.println("peeking the first elemnt" + linkedList.peekFirst());
		System.out.println("updated list" + linkedList);

//		Retrieves and removes the head (first element) of the list. Returns null if the list is empty.
		System.out.println("poll the elemnt" + linkedList.poll());
		System.out.println("updated list" + linkedList);

		System.out.println("poll the First elemnt" + linkedList.pollFirst());
		System.out.println("updated list" + linkedList);

//		Adds the specified element to the end of the list. Returns true if the element was added successfully.
		System.out.println("offer the elemnt" + linkedList.offer(3));
		System.out.println("updated list" + linkedList);

//      Adds the specified element to the begining of the list. Returns true if the element was added successfully.
		System.out.println("offer th first elemnt" + linkedList.offerFirst(3));
		System.out.println("updated list" + linkedList);

		linkedList.push(38);//add at the first 
		System.out.println("updated list" + linkedList);

		System.out.println("popping first element"+linkedList.pop());
		System.out.println("updated list" + linkedList);

		System.out.println(linkedListint);
		List<Integer> read_only_list=Collections.unmodifiableList(linkedListint);
		linkedListint.add(33);//add happems
		System.out.println(linkedListint);     
		try {
		System.out.println("Trying to modify the ReadOnly ArrayList.");    
                  
		read_only_list.add(56);
		}
		catch (UnsupportedOperationException e) {
	           System.out.println("The exception thrown is : " + e);
	       }
		
	}
}
