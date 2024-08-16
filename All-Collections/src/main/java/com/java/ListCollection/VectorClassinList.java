package com.java.ListCollection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Vector;

public class VectorClassinList {

	public static void main(String[] args) {
//conturctor with inita nd increment capacity
		 Vector<Integer> v = new Vector<>(3, 5);
	        
	        // Add elements to the vector
	        v.addElement(1);
	        v.addElement(2);
	        v.addElement(3);
	        v.addElement(5);
	        v.addElement(4);
	        v.addElement(10);
		       
	            System.out.println(v);
	        // Insert an element at index 1
	        v.insertElementAt(0, 1);
	        
	        // Remove the element at index 2
	        v.removeElementAt(4);
	        
	        // Print the elements of the vector
	        for (int i : v) {
	            System.out.println(i);
	        }
	       
	        v.capacity();
	        //colectio sonstructor
	    Vector<Integer> vctoer2=new Vector<>(v);
	    System.out.println("vector 2 using collection constryutor"+ vctoer2);
	    ArrayList<Integer> nums = new ArrayList<>();
		nums.add(2);
		nums.add(4);
		nums.add(5);
		nums.add(10);
		nums.add(5);
		nums.add(8); 
	
	    Vector<Integer> vctoer3=new Vector<>(nums);
	    System.out.println("vector 3 using collection constryutor"+ vctoer3);

	    HashSet<String> fruits = new HashSet<>();

		// Adding elements to the HashSet
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		fruits.add("Date");
		
		 Vector<String> vctoer4=new Vector<>(fruits);
		 
		    System.out.println("vector 4 using collection constryutor"+ vctoer4);
            
		    String[] array1=new String[4];
		    vctoer4.copyInto(array1);
		    for(String str:array1) {
		    	System.out.println(str);
		    }
		    System.out.println(array1);
		    
		    vctoer4.setElementAt("jam", 0);
		    System.out.println("vector 4 "+ vctoer4);

		   System.out.println("printing last element"+vctoer4.lastElement()); 
	
		   vctoer4.addElement("jamal");
		    System.out.println("vector 4 "+ vctoer4);

	}
 
}
