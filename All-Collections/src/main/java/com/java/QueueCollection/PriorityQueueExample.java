package com.java.QueueCollection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

	public static void main(String[] args) {

		Queue<Book> queue = new PriorityQueue<Book>();
		// Creating Books
		Book b1 = new Book(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(233, "Operating System", "Galvin", "Wiley", 6);
		Book b3 = new Book(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		// Adding Books to the queue
		queue.add(b1);
		queue.add(b2);
		queue.add(b3);
		System.out.println("Traversing the queue elements:");
		// Traversing queue elements
		for (Book b : queue) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
		queue.remove();
		System.out.println("After removing one book record:");
		for (Book b : queue) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}

		// TODO Auto-generated method stub
		while (!queue.isEmpty()) {
			System.out.println("Removed: " + queue.poll());
		}
//capacity constructoe

		PriorityQueue<Integer> pq = new PriorityQueue<>(20);

		// Add elements
		pq.add(5);
		pq.add(1);
		pq.add(3);

		// Print the PriorityQueue
		System.out.println("PriorityQueue (capacity constructor): " + pq);
		 pq.poll();
		 System.out.println("print pq after poll"+pq);//1 is removed
		// Remove elements
		while (!pq.isEmpty()) {
			System.out.println("Removed: " + pq.poll());
		}

		System.out.println("pq after remved" + pq);

		// comparator constructor

//        Example1
		Comparator<Person> ageComparator = (p1, p2) -> Integer.compare(p1.age, p2.age);

		// Create a PriorityQueue with the custom comparator
		PriorityQueue<Person> pq1 = new PriorityQueue<>(ageComparator);
//	Comparator<Person> ageComparator = new Comparator<Person>() {
//        @Override
//        public int compare(Person p1, Person p2) {
//            return Integer.compare(p1.age, p2.age);
//        }
//    };

		// Create a PriorityQueue with the custom comparator
//    PriorityQueue<Person> pq1 = new PriorityQueue<>(ageComparator);

		// Add Person objects
		pq1.add(new Person("Alice", 30));
		pq1.add(new Person("Bob", 25));
		pq1.add(new Person("Charlie", 35));

		// Print the PriorityQueue
		System.out.println("PriorityQueue (custom object comparator):");
		System.out.println(pq1);

		
		//    example 2/
		Comparator<String> reverseAlphabeticalComparator = new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s2.compareTo(s1);//doubt
			}
		};

		// Create a PriorityQueue with the custom comparator
		PriorityQueue<String> pq2 = new PriorityQueue<>(reverseAlphabeticalComparator);

		// Add strings
		pq2.add("apple");
		pq2.add("banana");
		pq2.add("cherry");
//		Iterator stringitr=new pq2.ietrator();
		
		for(String strs:pq2) {
			System.out.println(pq2);
		}

		// Print the PriorityQueue
		System.out.println("PriorityQueue (reverse alphabetical comparator):"+pq2);
//		System.out.println(;
		
		//Capacity and Comparator Constructor
		
		 PriorityQueue<Integer> pq4 = new PriorityQueue<>(30, Comparator.reverseOrder());
	        
	        // Add elements
		 pq4.add(10);
		 pq4.add(20);
		 pq4.add(5);
	        
	        // Print the PriorityQueue
	        System.out.println("PriorityQueue (capacity and comparator constructor): " + pq4);

	        //collecion constructor
	        
	        Collection<Integer> collection = Arrays.asList(30, 10, 20, 5);
	        
	        // Create a PriorityQueue from the collection
	        PriorityQueue<Integer> pq5 = new PriorityQueue<>(collection);
	        
	        // Print the PriorityQueue
	        System.out.println("PriorityQueue (collection constructor): " + pq5);
	        System.out.println(pq4.size());
	        
	        
	        //sorted constructor
	        
	
	
	
	
	}
}
