package com.java.SetCollection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Creating a TreeSet
        TreeSet<String> treeSet = new TreeSet<>();

        // Adding elements to the TreeSet
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Cherry");
        treeSet.add("Date");

        // Attempting to add a duplicate
        treeSet.add("Apple"); // Duplicate, will not be added

        // Displaying the TreeSet (sorted order)
        System.out.println("TreeSet: " + treeSet);

        // Accessing elements
        System.out.println("First element: " + treeSet.first());
        System.out.println("Last element: " + treeSet.last());
        
        
        System.out.println("Higher than 'Banana': " + treeSet.higher("Banana"));
        System.out.println("lowyer than 'Banana': " + treeSet.lower("Banana"));
        System.out.println(treeSet.ceiling("rebbbCherry"));
        System.out.println(treeSet.ceiling("Banana"));
        System.out.println(treeSet.ceiling("Datesssss"));//doubt
        System.out.println(treeSet.ceiling("IceApple"));
        //attemptig to add an element that cant be firts
        
//        treeSet.addFirst("Angir");//dount
        try {
        treeSet.addFirst("jamm");//dpubt
        }catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

//        treeSet.descendingSet();
//        System.out.println("decending set"+treeSet);
        System.out.println("using usual iyterator");

		Iterator<String> stringIterator = treeSet.iterator();
		while(stringIterator.hasNext()) {
			System.out.println(stringIterator.next());
		}
		System.out.println("using dcending iyterator");

		Iterator<String> stringIteratordescending = treeSet.descendingIterator();
		while(stringIteratordescending.hasNext()) {
			System.out.println( stringIteratordescending.next());
		}
//		treeSet.reversed();
//		  System.out.println("reversed set"+treeSet);
		  
		  
        TreeSet<Integer> treeSetnumber = new TreeSet<>();
        treeSetnumber.add(1);
        treeSetnumber.add(2);
        treeSetnumber.add(3);
        treeSetnumber.add(4);
        treeSetnumber.add(5);
        treeSetnumber.add(6);
    
        
        System.out.println(treeSetnumber.ceiling(5));
        System.out.println(treeSetnumber.ceiling(7));
        System.out.println(treeSetnumber.ceiling(6));
        System.out.println(treeSetnumber.ceiling(2));
        
        System.out.println("poll firsdt "+treeSetnumber.pollFirst());    
        System.out.println("poll last "+treeSetnumber.pollLast()); 
        
        System.out.println("floor  "+treeSetnumber.floor(4)); //doubt
        System.out.println("lowyer "+treeSetnumber.lower(6)); 
        System.out.println("head set "+treeSetnumber.headSet(5));//doubbt //pringt the elemebt whivh is upt gti 5
        System.out.println("head set "+treeSetnumber.headSet(5,true));
        System.out.println("head set "+treeSetnumber.headSet(5,false));
        
        
        System.out.println("tAIL set "+treeSetnumber.tailSet(3,false));
        System.out.println("tAIL set "+treeSetnumber.tailSet(3,true));
        System.out.println("tAIL set "+treeSetnumber.tailSet(3));
        
        System.out.println("sub set "+treeSetnumber.subSet(2,6));
        
    }
}
