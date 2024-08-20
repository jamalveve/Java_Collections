package com.practice.pgms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorExample {
	
	//1) using for loop use some copy list to iterate and add in actuall list
	//2)using iterator removing is fine and add using copy list and add in actuall list

	public static void main(String[] args) {

		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(2);
		nums.add(4);
		nums.add(5);
		nums.add(10);
		nums.add(5);
		nums.add(8);

		//1)for loop using copy list and add directly to main list(both add and renove )
		List<Integer> copyList = new LinkedList<>(nums);

		for (Integer numbers : copyList) {
			if (numbers > 6) {
				nums.remove(numbers);
			} else if (numbers == 5) {
				nums.add(12);
			}
		}
		System.out.println("copied list" + copyList);

		System.out.println("removing using for use by copy list and new Actual list" + nums);
     //2)itertor removing is fine and  adding using copy list
		Iterator<Integer> listIteratir=nums.iterator();
		while(listIteratir.hasNext()) {
			int currentEntry=listIteratir.next();
			if(currentEntry>8) {
				listIteratir.remove();
			}
			if(currentEntry==5) {
////					nums.add(23);concurentvmodofication ecxception
					copyList.add(23);
			}
//		not correct way to add
			
		}
		nums.addAll(copyList);
		System.out.println("removing using iterator and new Actual list"+nums);

		
		  // Use a ListIterator to safely add elements during iteration
        ListIterator<Integer> listIterator = nums.listIterator();

        while (listIterator.hasNext()) {
            int item = listIterator.next();
            System.out.println("Processing: " + item);
            
            // Add elements based on a condition
            if (item==5) {
                listIterator.add(8); // Safe to add here
            }
        }
        System.out.println("adding using listiterator and new Actual list"+nums);
		
        ////////////////////////////////////////////////////////////
        
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("actual List: " + list);

        // Use a ListIterator to safely add elements during iteration
        Iterator<String> listforIterator = list.listIterator();
        List<String> newElements1 = new ArrayList<>();
        while (listforIterator.hasNext()) {
            String item = listforIterator.next();
            System.out.println("Processing: " + item);
            
            // Add elements based on a condition
            if (item.equals("B")) {
//            	list.add("New Element");//conncrrent modification
            	newElements1.add("new Elemnet");
            }
        }
        list.addAll(newElements1);

        // Print the updated list
        System.out.println("Updated List: " + list);
        
		System.out.println("-----------------------------------------------");
		 // Create and populate the set
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");

        // Create a list to collect new elements
        List<String> newElements = new ArrayList<>();

        // Iterate over the set
        Iterator<String> setiterator = set.iterator();
        while (setiterator.hasNext()) {
            String item = setiterator.next();
            System.out.println("Processing: " + item);
            
            // Collect new elements based on a condition
            if (item.equals("B")) {
                newElements.add("New Element");
            }
        }

        // Add collected elements to the set after iteration
        set.addAll(newElements);

        // Print the updated set
        System.out.println("Updated Set: " + set);
        System.out.println("----------------------------------------------------------");
		// Create a HashMap and populate it
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 30);
		map.put("B", 60);
		map.put("C", 20);
		map.put("D", 70);
//using copy map
		LinkedHashMap<String, Integer> copyMap = new LinkedHashMap<>(map);

		for (Map.Entry<String, Integer> entry : copyMap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());

			if (entry.getValue() < 50) {
				map.remove(entry.getKey()); // Safe to remove from original
			} else {
				// Safe to add new entries to the original map
				map.put("NewKey" + entry.getKey(), 60);
			}
		}
		// Create a List to hold new entries to add
		List<Map.Entry<String, Integer>> newEntries = new ArrayList<>();

		// Get an iterator for the map's entry set
		Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, Integer> entry = iterator.next();

			// Print the key and value
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());

			// Example operation: Remove an entry based on a condition
			if (entry.getValue() < 50) {
				iterator.remove(); // safe to Remove entries from iteratir with values less than 50
//	                map.remove(entry.getKey());
			}

			// Example operation: Collect entries to add later
			if (entry.getValue() != 100) {
				newEntries.add(Map.entry("NewKey", 100)); // safeto add new entries in iterator based on a condition
//	                map.put("NewKey", 100); concrrent modification exception
			}
		}

		// Add new entries to the map after the iteration
		for (Map.Entry<String, Integer> newEntry : newEntries) {
			map.put(newEntry.getKey(), newEntry.getValue());
		}

		// Print the updated map
		System.out.println("Updated Map: " + map);
	}

}
