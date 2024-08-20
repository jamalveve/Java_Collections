package com.practice.pgms;

import java.util.Arrays;
import java.util.List;
//1. Given an array in Java, convert it to a collection.
public class ArrayToListcovert {

	public static void main(String[] args) {

		String[] array1= { "jam" ,"kamal","leela","sowmy"};
		int length=array1.length;
		for(int i=0;i<length;i++) {
			System.out.println("index: "+i+", value: "+array1[i]);
			
		}
		//convert to list
		List<String>arrayToList=Arrays.asList(array1);
		System.out.println("printing the list converted from array: "+arrayToList);
	}

}
