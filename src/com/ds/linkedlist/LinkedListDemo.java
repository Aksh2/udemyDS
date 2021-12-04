package com.ds.linkedlist;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedListImpl<String> linkedList = new LinkedListImpl<String>();
		linkedList.add("Rohit");
		linkedList.add("chaya");
		linkedList.add("divya");
		linkedList.add("nithu");
		System.out.println("before delete");
		linkedList.display();
		System.out.println("after delete");
		linkedList.delete();
		linkedList.display();




	}

}
