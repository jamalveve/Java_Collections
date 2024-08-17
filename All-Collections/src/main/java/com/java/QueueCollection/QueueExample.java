package com.java.QueueCollection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
public static void main(String[] args) {
	
	Queue<String> priqueue=new PriorityQueue<>();
	
	priqueue.add("dummy");
	priqueue.add("some");
	priqueue.add("guess");
	priqueue.add("nothing");
	priqueue.add("dummy");
	priqueue.add("1");
	
	System.out.println(priqueue);
	Iterator<String> queiterator = priqueue.iterator();
	
	while(queiterator.hasNext()) {
		String cuurentvalue=queiterator.next();
		if(cuurentvalue.contains("d")) {
			queiterator.remove();
			System.out.println("removed");
			continue;
		}
	}
	
	System.out.println(priqueue);
	
	PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

    // Add elements using add() and offer()
    priorityQueue.add(5); // Will add 5
    priorityQueue.offer(3); // Will add 3
    priorityQueue.offer(8); // Will add 8
    priorityQueue.add(1); // Will add 1

    // Show the elements in the queue
    System.out.println("Initial Priority Queue: " + priorityQueue);

    // Check size
    System.out.println("Size of Priority Queue: " + priorityQueue.size());

	
    // Check if the queue contains a specific element
    System.out.println("Contains 3? " + priorityQueue.contains(3));

    // IndexOf - Since PriorityQueue doesn't have this method natively, we will implement a custom search
//    System.out.println("Index of 3: " + priorityQueue.in);

    // Remove specific element
    priorityQueue.remove(100); // Remove the element 3
    System.out.println("Priority Queue after removing 3: " + priorityQueue);

    // Poll to retrieve and remove the head of the queue
    System.out.println("Poll result: " + priorityQueue.poll());
    System.out.println("Priority Queue after poll: " + priorityQueue);
    
    // Convert to array
    Object[] array = priorityQueue.toArray();
    System.out.println("Array representation: " + Arrays.toString(array));

    // Clear the queue
    priorityQueue.clear();
    System.out.println("Priority Queue after clear: " + priorityQueue);
    System.out.println("Size after clear: " + priorityQueue.size());
}

	
	
	
	
	
	
	
	
	
	
	
	
}
