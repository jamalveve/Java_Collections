package com.java.SetCollection;

import java.util.LinkedHashSet;

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
			}
		}
		lhs = lhsnew;
		System.out.println(lhs);

	}

}
