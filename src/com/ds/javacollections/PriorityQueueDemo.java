package com.ds.javacollections;

import java.util.PriorityQueue;

import com.ds.onedarray.Student;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		System.out.println("Priority Queue");
		PriorityQueue<Integer> pq = new PriorityQueue();
		pq.add(15);
		pq.add(10);
		pq.add(11);
		pq.add(14);
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		
		System.out.println("Priority Queue for students");
		PriorityQueue<Student> pStudents = new PriorityQueue<Student>();
		pStudents.add(new Student("Hussien", 27));
		pStudents.add(new Student("Jena", 2));
		pStudents.add(new Student("laya",1));
		System.out.println(pStudents.poll().name);

	}

}
