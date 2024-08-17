package com.java.QueueCollection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequueeExample {

	public static void main(String[] args) {

		ArrayDeque<String> deque = new ArrayDeque<String>();  
		   deque.add("Ravi");    
		   deque.add("Vijay");     
		   deque.add("Ajay");    
		   //Traversing elements  
		   for (String str : deque) {  
		   System.out.println(str);  
		   }  
		   
		   deque.offer("arvind");  
		    deque.offer("vimal");  
		    deque.add("mukul");  
		    deque.offerFirst("jai");  
		    System.out.println("After offerFirst Traversal...");  
		    for(String s:deque){  
		        System.out.println(s);  
		    }  
		    //deque.poll();  
		    //deque.pollFirst();//it is same as poll()  
		    deque.pollLast();  
		    System.out.println("After pollLast() Traversal...");  
		    for(String s:deque){  
		        System.out.println(s);  
		        
		        
		        deque.add(s);
		        deque.addAll(deque);
		        deque.addFirst(s);
		        deque.addLast(s);
		        
		        deque.remove(s);
		        deque.removeAll(deque);
		        deque.removeFirst();
		        deque.removeLast();
		        deque.removeFirstOccurrence(s);
		        deque.removeLastOccurrence(s);
		        deque.removeIf(null);
		       
		        deque.peek();
		        deque.peekFirst();
		        deque.peekLast();
		        
		        deque.poll();
		        deque.pollFirst();
		        deque.pollFirst();
		        
		        deque.pop();
		        
		        deque.contains(deque);
		        deque.containsAll(deque);
		        deque.clear();
		        deque.element();
		        deque.equals(deque);
		        deque.getFirst();
		        deque.getLast();
		        
		        deque.isEmpty();
		        
		        deque.offer(s);
		        deque.offerFirst(s);
		        deque.offerLast(s);
		        deque.clone();
		        
		        deque.size();
		        deque.reversed();
		        
//		        deque.toArray();
//		        
//		        deque.toArray(null);//generic
		        
		        deque.toString();
		        
		        
	}

}
}
