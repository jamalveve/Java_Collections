package com.practice.pgms;

import java.util.Enumeration;
import java.util.Hashtable;
public class HashTableEnumeration {
//	Write a program in Java to display the contents of a HashTable using enumeration.
	public static void main(String[] args) {
		 Hashtable<Integer, String> hash_table = new Hashtable<Integer, String>();

		     hash_table.put(1, "Monday");
		     hash_table.put(2, "Tuesday");
		     hash_table.put(3, "Wednesday");
		     hash_table.put(4, "Thursday");
		     hash_table.put(5, "Friday");
		     hash_table.put(6, "Saturday");
		     hash_table.put(7, "Sunday");
		     
		     Enumeration enum__hash_table=hash_table.elements();
System.out.println("print the hashtable by enumeration");
		     while(enum__hash_table.hasMoreElements()) {
		    	 System.out.println(enum__hash_table.nextElement());
		     }
//		     We notice that the order of the values is not the same as that of the order in
//		     which we inserted the key-value pair in the hashtable. 
//		     This is because the elements of a Hashtable are not guaranteed to be in any
//		     particular sequence. The hashtable's implementation divides values into 
//		     multiple buckets based on their Hashcode and internal implementation, 
//		     which means that the same values may appear in a different order 
//		     on different machines, runs, or versions of the framework. 
//		     This is because Hashtables are designed to retrieve data by key rather than by order.

	}

}
