package com.ds.javacollections;

import java.util.HashSet;
import java.util.Iterator;

public class TreeSetDemo {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("hussien");
		hs.add("jena");
		hs.add("alaya");
		
		Iterator<String> itr = hs.iterator();
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}
	}
}
