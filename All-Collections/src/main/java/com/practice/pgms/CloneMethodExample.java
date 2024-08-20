package com.practice.pgms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class CloneMethodExample {

	public static void main(String[] args) {
		ArrayList<String> originalList = new ArrayList<>();
        originalList.add("apple");
        originalList.add("banana");

        // Clone the ArrayList
        @SuppressWarnings("unchecked")
        ArrayList<String> clonedList=(ArrayList<String>)originalList.clone();

        // Print the lists
        System.out.println("Original List: " + originalList);
        System.out.println("Cloned List: " + clonedList);
        clonedList.add("dates");
        
        System.out.println("Original List after adding new element in clonedlist: " + originalList);
        System.out.println("Cloned List: " + clonedList);
        
        

        
        HashSet<String> originalSet = new HashSet<>();
        originalSet.add("apple");
        originalSet.add("banana");

        // Clone the HashSet
        @SuppressWarnings("unchecked")
        HashSet<String> clonedSet = (HashSet<String>) originalSet.clone();

        // Print the sets
        System.out.println("Original Set: " + originalSet);
        System.out.println("Cloned Set: " + clonedSet);
        
        LinkedList<String> originalList2 = new LinkedList<>();
        originalList2.add("apple");
        originalList2.add("banana");

        // Clone the LinkedList
        @SuppressWarnings("unchecked")
        LinkedList<String> clonedList2 = (LinkedList<String>) originalList2.clone();

       
        // Print the lists
        System.out.println("Original List: " + originalList2);
        System.out.println("Cloned List: " + clonedList2);
        originalList2.add("Dates");
        // Print the lists
        System.out.println("Original List after adding new element: " + originalList2);
        System.out.println("Cloned List: " + clonedList2);
        
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1, "jam");
        hm.put(2, "Venu");
        hm.put(3, "pipu");
        
        HashMap<Integer,String> clonedMap=(HashMap<Integer,String>)hm.clone();
        
        // Print the lists
        System.out.println("Original map: " + hm);
        System.out.println("Cloned map: " + clonedMap);
        hm.put(4, "shari");
        System.out.println("Original map afer adding new element: " + hm);
        System.out.println("Cloned map: " + clonedMap);
        
        
        
	}

}
