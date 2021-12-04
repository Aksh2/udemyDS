package com.ds.javacollections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("hussien");
		ll.add("jena");
		ll.add("laya");
		Iterator<String> itr = ll.iterator();
				
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}


		
	}

}
