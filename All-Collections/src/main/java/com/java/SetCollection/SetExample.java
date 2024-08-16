package com.java.SetCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set<String> data=new HashSet<>();
		data.add("JavaTpoint");   
	    data.add("null");   
	    data.add("Example");   
	    data.add("Set");   

	    System.out.println(data); 
	    LinkedHashSet<String > stringdata=new LinkedHashSet<String>();
	    stringdata.add("JavaTpointsss");   
	    stringdata.add("jaaml");   
	    stringdata.add("jamu");   
	    stringdata.add(null);   
	    stringdata.add("null");   
	    stringdata.add(null); 
	    System.out.println(stringdata);
	    //as it is set no duplicates
	    data.addAll(stringdata);
	    System.out.println(data); 
	    
	    
	    
//	    we can perform all the basic mathematical operations like intersection, union and difference.
	    
	    Integer[] A = {22, 45,33, 66, 55, 34, 77};  
        Integer[] B = {33, 2, 83, 45, 3, 12, 55,2};  
        
        Set<Integer> set1 = new HashSet<Integer>();    
        set1.addAll(Arrays.asList(A));    
        Set<Integer> set2 = new HashSet<Integer>();    
        set2.addAll(Arrays.asList(B));    
        System.out.println(set2);
    
        // Finding Union of set1 and set2   
        Set<Integer> union_data = new HashSet<Integer>(set1);    
        union_data.addAll(set2);    
        System.out.print("Union of set1 and set2 is:");    
        System.out.println(union_data);    
    
        // Finding Intersection of set1 and set2    
        Set<Integer> intersection_data = new HashSet<Integer>(set1);    
        intersection_data.retainAll(set2);    
        System.out.print("Intersection of set1 and set2 is:");    
        System.out.println(intersection_data);    
    
        // Finding Difference of set1 and set2    
        Set<Integer> difference_data = new HashSet<Integer>(set1);    
        difference_data.removeAll(set2);    
        System.out.print("Difference of set1 and set2 is:");    
        System.out.println(difference_data);  
        
        
        Set<Integer> datas = new LinkedHashSet<Integer>();   
        datas.add(31);   
        datas.add(21);   
        datas.add(41);   
        System.out.println("Set: " + datas);  
        Set<Integer> newData = new HashSet<Integer>();   
        newData.add(91);   
        newData.add(71);   
        newData.add(81);  
        datas.addAll(newData);   
        System.out.println("Set: " + datas);
		System.out.println("===================================iteration=======================");
	
	
	}
}

class HashSetExample{
	
}