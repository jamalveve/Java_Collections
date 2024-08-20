package com.practice.pgms;

import java.util.TreeSet;

public class CloneTreetsettoAnotherTreeSet {
//	Write a program in Java to clone a Treeset to another Treeset.
	public static void main(String[] args) {

		 
	     TreeSet<String> tree_set = new TreeSet<String>();//creating an empty tree set
	     //adding values in the tree set
	     tree_set.add("Monday");
	     tree_set.add("Tuesday");
	     tree_set.add("Wednesday");
	     tree_set.add("Thursday");
	     tree_set.add("Friday");
	     tree_set.add("Saturday");
	     tree_set.add("Sunday");
	    
	     //printing the original tree set
	     System.out.println("The original tree set is as follows : " + tree_set); 
	     //cloning the tree set
	     TreeSet<String> cloned_tree_set = (TreeSet<String>)tree_set.clone();
	     //printing the cloned tree set
	     System.out.println("The cloned tree set is as follows : " + cloned_tree_set);      
	}

}
