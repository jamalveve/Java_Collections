package com.java.MapInterface;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableExample {

	public static void main(String[] args) {


        // Creating an empty hashtable
        Hashtable<Integer, String> hash
            = new Hashtable<Integer, String>();

        // Inserting key-value pairs into hash table
        // using put() method
        hash.put(1, "Geeks");
        hash.put(2, "for");
        hash.put(3, "Geeks");
        hash.put(5, "orrrr");

        // Now creating an Enumeration object
        //  to read elements
        Enumeration e = hash.elements();

        // Printing elements of hashtable
        // using enumeration
        while (e.hasMoreElements()) {
             hash.put(4,"geekkkks");
            // Printing the current element
            System.out.println(e.nextElement());
        }
        hash.put(4,"geekkkks");
        System.out.println(hash);
        //LiFO
	}

}
