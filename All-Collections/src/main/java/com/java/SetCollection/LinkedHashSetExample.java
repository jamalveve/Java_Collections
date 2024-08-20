package com.java.SetCollection;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.SequencedSet;
import java.util.Collections;
import java.util.Comparator;
public class LinkedHashSetExample {
	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("spomeig");
		lhs.add("ruuhfmxhi");
		lhs.add("odkjiewzyhi");
		lhs.add("wpoihe");
		lhs.add("kjhgfd");
		lhs.add("owueihwi");
		lhs.addFirst("uytrew");

		lhs.addLast("jamal");
		System.out.println(lhs.getLast());

//		Iterator lhsitr=new lhs.iterator();
//		lhs.reversed();//there is no iteraort
		System.out.println("printing the linkedhashset: " + lhs);

		LinkedHashSet<String> lhsnew = new LinkedHashSet<>();

		for (String str : lhs) {
			if (!str.contains("z")) {
//				System.out.println(str);
//				aswe dont have remove copying it to anither set
				lhsnew.add(str);
//				lhsnew.remove(str);
				
			}
		}
		lhs = lhsnew;
		System.out.println("primting the lhs"+lhs);
		
		Comparator cmp=Collections.reverseOrder();
//		Collections.sor also not there
//		Collections.re

		Collections.unmodifiableSet(lhsnew);
		lhsnew.add("modifed");
		System.out.println(lhsnew);
		
//		Collections.synchronizedList(lhsnew);not posisible	
		
//		from java 21
		SequencedSet<String> set = new LinkedHashSet<>();
		set.add("seqsetvalue1");
		set.add("heelo");
		set.add("jamyyy");
		SequencedSet<String> reversedSet = set.reversed();
		
		System.out.println(reversedSet);
		
	}

}
