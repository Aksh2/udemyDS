package com.ds.dynamicqueue;

public class QueueDArrayDemo {
	
		public static void main(String args[]) {
			QueueDArray<Integer> q = new QueueDArray<Integer>(2);
			q.queue(11);
			q.queue(12);
			
			System.out.println("Size:"+ q.getSize());
			q.queue(13);
			System.out.println("Size:"+ q.getSize());
		}

}
