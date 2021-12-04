package com.ds.queuearrayimplementation;

public class QueueArrayDemo {

	public static void main(String[] args) {
		QueueArray<Integer> q = new QueueArray<Integer>(5);
		q.queue(5);
		q.queue(2);
		q.queue(3);
		q.queue(6);
		q.queue(8);
		q.queue(8);
		System.out.println("Dequeue:" +q.deQueue());
		System.out.println("Dequeue:" +q.deQueue());
		

	}

}
