package com.java.SetCollection;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import jdk.internal.joptsimple.internal.Strings;

public class HashSetMethods {

	public static void main(String[] args) {
		Set<Integer> setInteger = new HashSet<Integer>();
		setInteger.add(3);
		setInteger.add(5);
		setInteger.add(10);
		setInteger.add(11);
		setInteger.add(5);
		setInteger.add(8);
		setInteger.add(1);
		setInteger.add(90);
		setInteger.add(100);
		System.out.println("set is " + setInteger);

		System.out.println(setInteger.contains(3));
		Set<Integer> setInteger2 = new HashSet<Integer>();
		setInteger2.add(10);
		setInteger2.add(11);
		setInteger2.add(3);
		setInteger2.add(100);
		setInteger2.add(8);
		setInteger2.add(81);

		System.out.println(setInteger.containsAll(setInteger2));
		System.out.println(setInteger2.containsAll(setInteger));

		Set<Integer> setInteger3 = new HashSet<Integer>();
		setInteger3.add(3);
		setInteger3.add(5);
		setInteger3.add(10);
		setInteger3.add(11);
		setInteger3.add(5);
		setInteger3.add(8);
		setInteger3.add(1);
		setInteger3.add(90);
		setInteger3.add(100);

//		Comparator cmp=Collections.reverseOrder();
//		Collections.sort(setInteger3,cmp);
		
		
		
		System.out.println(setInteger.contains(setInteger3));

		System.out.println(setInteger3.hashCode());
		System.out.println(setInteger.hashCode());
		System.out.println(setInteger2.hashCode());

		System.out.println(setInteger2.isEmpty());
		System.out.println(setInteger.equals(setInteger3));

		System.out.println(setInteger2.equals(setInteger3));

		setInteger.remove(3);
		System.out.println("setInteger after removing 3" + setInteger);

//		setInteger.remove(setInteger2);//not possible
		setInteger.removeAll(setInteger2);
		System.out.println("setInteger after removing setInteger2" + setInteger);

		setInteger.toString();
		System.out.println("setInteger after to string" + setInteger);

//		setInteger.retainAll(setInteger2);//retain is common
		System.out.println("setInteger after retaiing setInteger2 " + setInteger2);

		System.out.println("setInteger after retaiing setInteger2 " + setInteger);

		setInteger2.retainAll(setInteger);
		System.out.println("setInteger after retaiing setInteger2 " + setInteger2);

		System.out.println("setInteger after retaiing setInteger2 " + setInteger);
//		setInteger.notifyAll(); use in theread

		System.out.println("size pf the set" + setInteger.size());

		// Convert the set to an array (default method)

		Object[] setToArray1 = setInteger.toArray();
		System.out.println("set to array1 " + setInteger);

		Object[] setToArray = setInteger.toArray(new Object[setInteger.size()]);
		System.out.println("set to array 2" + setInteger);
		for (Object obj : setToArray) {
			System.out.print(obj + " "); // Output may vary in order: 1 2 3 4
		}
		System.out.println();

		// Convert the set to an array of Integer
		Integer[] array2 = setInteger.toArray(new Integer[0]);

		for (Integer obj : array2) {
			System.out.print(obj + " "); // Output may vary in order: 1 2 3 4
		}
		System.out.println();
		// prints 3 times as three elements are nthere no need to iterate
		for (Integer obj : array2) {
			System.out.println(array2[2]); // Output may vary in order: 1 2 3 4
		}

		System.out.println(array2[1]);
		System.out.println(array2[1].equals(array2[2]));
		System.out.println(array2.length);

		System.out.println(array2[1].MAX_VALUE);
//	        The line System.out.println(array2[1].MAX_VALUE); contains a mistake in the way it attempts to access MAX_VALUE. In Java, MAX_VALUE is a constant defined in the Integer class (as well as in other wrapper classes like Double, Float, etc.). However, it is a static field and should be accessed using the class name, not through an instance of the class.
		System.out.println(Integer.MAX_VALUE);

		System.out.println(setInteger.getClass()); // java.util.hasshet

		Set<String> setOfSTrings = new HashSet<String>();

		setOfSTrings.add("venky");
		setOfSTrings.add("jamal");
		setOfSTrings.add("ahana");
		setOfSTrings.add("umar");
		setOfSTrings.add("abii");
		setOfSTrings.add("ejna");

		System.out.println("printing set of strings" + setOfSTrings);
//enchanced for loop->prints multiple times
		for (String var : setOfSTrings) {
//			if(var.equals("jamal"))
//				setOfSTrings.remove(var);//conncurrent modifuaction exception
			System.out.println("printing set of string"+setOfSTrings);

		}

		// Strings to check for friendship
		String string1 = "jamal";
		String string2 = "venky";
		// way 1
		if (setOfSTrings.contains(string1) && setOfSTrings.contains(string2)) {
			System.out.println(string1 + " and " + string2 + " are friends.");
		} else {
			System.out.println("Either " + string1 + " or " + string2 + " is not in the set.");
		}

		// Check if both strings are present in the set way 2
		boolean foundString1 = false;
		boolean foundString2 = false;

		// Iterate through the set to fetch the required strings
		for (String str2 : setOfSTrings) {
			if (str2.equals(string1)) {
				foundString1 = true;
			}
			if (str2.equals(string2)) {
				foundString2 = true;
			}
			// Break the loop early if both are found
			if (foundString1 && foundString2) {
				break;
			}
		}

		if (foundString1 && foundString2) {
			System.out.println(string1 + " and " + string2 + " are friends.");
		} else {
			System.out.println("Either " + string1 + " or " + string2 + " is not in the set.");
		}
	//iterator and its method

		Iterator<String> stringIterator = setOfSTrings.iterator();
		while (stringIterator.hasNext()) {
			String current=stringIterator.next();
			if(current.contains("i")) {
				stringIterator.remove();
				System.out.println("String which has letter i is removed"+current);
			}

		}
		System.out.println("print the elmemts"+setOfSTrings);

		System.out.println("using dcending iyterator");

		
		Iterator<String> stringIterators = setOfSTrings.iterator();
//	       
		
		

//	       String firstName = stringIterator.next(); // save first name to variable
//	       System.out.println(firstName);
		// stringIterator.forEachRemaining(System.out::println);

		if (stringIterators.hasNext()) {
			System.out.println("printing the first element: " + stringIterators.next());
		}
		Set<String> remainingelements = new HashSet<>();
		stringIterators.forEachRemaining(remainingelements::add);
		System.out.println("printing the remaoming elsemts: " + remainingelements);
//	     
		stringIterators.forEachRemaining(name -> System.out.println("printing remaining names" + name));
//	     LinkeHas 

		Iterator<String> stringIterators3 = setOfSTrings.iterator();
		while (stringIterators3.hasNext()) {
			String currentValue = stringIterators3.next();
			if (currentValue.contains("j")) {
				stringIterators3.remove();
				System.out.println("removed this name" + currentValue);
			}
		}

 	        
	}

}
