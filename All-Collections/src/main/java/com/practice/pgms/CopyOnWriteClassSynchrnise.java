package com.practice.pgms;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteClassSynchrnise {

	public static void main(String[] args) {


	       CopyOnWriteArrayList<String> synchronized_list
	           = new CopyOnWriteArrayList<String>();// creating a thread-safe Arraylist.
	 
	       // Adding strings to the synchronized ArrayList
	       synchronized_list.add("learn");
	       synchronized_list.add("practice");
	       synchronized_list.add("solve");
	       synchronized_list.add("interview");
	 
	       System.out.println("The synchronized ArrayList has the following elements :");
	 
	       // Iterating on the synchronized ArrayList using an iterator.
	       Iterator<String> it = synchronized_list.iterator();
	 
	       while (it.hasNext())
	           System.out.println(it.next());
	   }
	}

