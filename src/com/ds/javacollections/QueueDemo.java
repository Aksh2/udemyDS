package com.ds.javacollections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(12);
		q.add(13);
		q.add(14);
		q.add(15);
		System.out.println(q.poll());
	}
	
}
