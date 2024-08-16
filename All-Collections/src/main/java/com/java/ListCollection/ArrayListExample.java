package com.java.ListCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(2);
		nums.add(4);
		nums.add(5);
		nums.add(10);
		nums.add(5);
		nums.add(8);

		nums.add(21);
		nums.add(null);// doubt
		nums.add(null);

		for (Integer ints : nums) {
//		if(ints %2==0) {//here we are getting nullpointerexception bz=cz we are trying to check null also in iteration
			// so we can wrote like this
			if (ints != null && ints % 2 == 0)
				System.out.println("priniting the even numbers: " + ints);
			else {
				System.out.println("Encountered a null value.");
			}
		}

		System.out.println("Printing Even numbers from the list: ");
		for (Integer intss : nums) {
//		if(ints %2==0) {//here we are getting nullpointerexception bz=cz we are trying to check null also in iteration
			// so we can wrote like this
			if (intss != null && intss % 2 == 0)
				System.out.println(intss);

            // Modify the list during iteration
//            if (intss == 5) {
//            	nums.remove(Integer.valueOf(5)); // This will cause ConcurrentModificationException
//            }
			else {
				continue;/// if we give break here it will bfreak if some odd number comes between
			}
		}
		//or
//		 while (iterator.hasNext()) {
//	            Integer number = iterator.next();
//	            System.out.println("Current number: " + number);
//
//	            // Modify the list during iteration
//	            if (number == 3) {
//	                list.remove(Integer.valueOf(3)); // This will cause ConcurrentModificationException
//	            }
//	        }

		System.out.println("comming out of the loop and saying Encountered NUl values.");

		
		
		
		//constructor 1 above
		// consrtrcutor 2
//	ArrayList<String> listofStrings=new ArrayList<>(null);npe
//	ArrayList<String> listofStrings=new ArrayList<>(-5);//IllegalArgumentException
		ArrayList<String> listofStrings = new ArrayList<>(20);
		// Add some elements to the list
		listofStrings.add("Apple");
		listofStrings.add("Banana");
		listofStrings.add("Cherry");
		listofStrings.add("Date");
		listofStrings.add("Elderberry");
		listofStrings.add("Date");
		listofStrings.add("Elderberry");

		// Print the elements in the list
		System.out.println("Elements in the list:");
		for (String fruit : listofStrings) {
			System.out.println(fruit);
		}

		// Print the size and capacity of the list
		System.out.println("\nSize of the list: " + listofStrings.size());
		// Capacity is not directly accessible in ArrayList, but we can infer it from
		// the initial capacity

		System.out.println("Initial capacity was set to 20, but the actual capacity might grow dynamically.");

		System.out.println(listofStrings);

		System.out.println("initial size" + listofStrings.size());

		listofStrings.remove("Banana");
		listofStrings.remove("Date");

		System.out.println("aftre removing some elemnets size is" + listofStrings.size());

		System.out.println("before trimming the size" + listofStrings.size());
		listofStrings.trimToSize();// not visible to user
		System.out.println("after trimming the size" + listofStrings.size());

		listofStrings.add("ghjh");
		System.out.println("getting the element in particlar index" +listofStrings.get(3));
		listofStrings.reversed();//doubt
		Collections.reverse(listofStrings);
		
		listofStrings.set(3, "helloImam6");
		System.out.println(listofStrings);
		
	

		System.out.println("-------------------------------------------------------");
//construcrior 3 collecrion

		Set<String> treesetStringss = new TreeSet<>();
		treesetStringss.add("jamuuu");
		treesetStringss.add("jamuuuluuu");
		treesetStringss.add("jamaalluu");
		treesetStringss.add("jamyy");
		treesetStringss.add("jam");
		treesetStringss.add("jam");

		System.out.println(treesetStringss);

		ArrayList<String> list = new ArrayList<>(treesetStringss);

		System.out.println(list);// we weont get the duplicated as tree already giving uniquw elements to our
									// list

		list.add("jam");
		list.add("jamyy");

		System.out.println(list);// here we can xpect the duplicated values

		System.out.println("before trimming the size" + list.size());

		list.trimToSize();
		System.out.println("after trimming the size" + list.size());

		list.ensureCapacity(18);
		// This is particularly useful when you know in advance that you will be adding
		// a large number of elements and want to avoid frequent resizing.
		// System.out.println("Capacity should be at least 18 (capacity is managed
		// internally).");
		for (int i = 0; i < 15; i++) {
			list.add("Element " + i);
		}
		System.out.println(list.size());/// still 7 only

		System.out.println("list rigjt now: " + list);

		System.out.println(list.indexOf("jam"));
		System.out.println(list.lastIndexOf("jam"));
		System.out.println("-----------clone------------------------");
		list.clone();
		System.out.println(list);

		ArrayList<String> originalList = new ArrayList<>();
		originalList.add("Apple");
		originalList.add("Banana");
		originalList.add("Cherry");

		// Clone the original list
		ArrayList<String> clonedList = (ArrayList<String>) originalList.clone();

		// Print both lists
		System.out.println("Original List: " + originalList);
		System.out.println("Cloned List: " + clonedList);

		// Modify the cloned list
		clonedList.add("Date");

		// Print both lists after modification
		System.out.println("\nAfter modifying the cloned list:");
		System.out.println("Original List: " + originalList);
		System.out.println("Cloned List: " + clonedList);
	
	
	}

}
