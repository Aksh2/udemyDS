package com.ds.doublylinkedlist;

public class LinkedListDDemo {
	
	public static void main(String[] args) {
		LinkedListD<String> ls = new LinkedListD<String>();
		ls.add("Hussien");
		ls.add("Jena");
		ls.add("laya");
		ls.add("Waeel");
		System.out.println("before delete");
		ls.display();
		System.out.println("after delete");
		ls.delete();
		ls.display();
	}

}
