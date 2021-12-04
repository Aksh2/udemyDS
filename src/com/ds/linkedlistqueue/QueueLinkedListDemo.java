package com.ds.linkedlistqueue;

public class QueueLinkedListDemo {
	public static void main(String args[]) {
		QueueLinkedList<String> q = new QueueLinkedList<String>();
		q.queue("Jena");
		q.queue("laya");
		q.queue("hussien");
		
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());


	}
}
