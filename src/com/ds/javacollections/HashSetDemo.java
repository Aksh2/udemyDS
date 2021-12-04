package com.ds.javacollections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("hussien");
		hs.add("jena");
		hs.add("laya");
		hs.add("laya");
		Iterator<String> itr = hs.iterator();
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}
	}

}
