package com.practice.pgms;

import java.util.ArrayList;

public class TwoArrayListAddExample {

	public static void main(String[] args) {
		 ArrayList<String> list_1 = new ArrayList<String>();

	        list_1.add("Geeks");
	        list_1.add("For");
	        list_1.add("ForGeeks");

	        // Print the ArrayList 1
	        System.out.println("ArrayList 1: " + list_1);

	        ArrayList<String> list_2 = new ArrayList<String>();

	        list_2.add("GeeksForGeeks");
	        list_2.add("A computer portal");

	        // Displaying the ArrayList 2
	        System.out.println("ArrayList 2: " + list_2);

	        // using Collection.addAll() method to join two
	        // arraylist
	        list_1.addAll(list_2);

	        // Print the joined ArrayList
	        System.out.println("Joined ArrayLists: " + list_1);
	}

}
