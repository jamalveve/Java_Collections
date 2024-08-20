package com.practice.pgms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class ShuffleCollection {

	public static void main(String[] args) {

		Set<Integer> setofInteger =new LinkedHashSet<>();
		setofInteger.add(10);
		setofInteger.add(40);
		setofInteger.add(120);
		setofInteger.add(100);
		setofInteger.add(14);
//		Collections.shunot possinlr

		ArrayList<String> array_list = new ArrayList<String>();//creating an arraylist of strings
	     
	     array_list.add("Monday");
	     array_list.add("Tuesday");
	     array_list.add("Wednesday");
	     array_list.add("Thursday");
	     array_list.add("Friday");
	     array_list.add("Saturday");
	     array_list.add("Sunday");
	     
	     Collections.shuffle(array_list);
	     System.out.println(array_list);
		
	}

}
