package com.ds.dynamicqueue;

import java.util.Arrays;

public class QueueDArray<T> {
	
		Object[] arrayQueue;
		int rear;
		int front;
		int size;

		public QueueDArray(int size) {
			this.size=size;
			arrayQueue = new Object[this.size];
			front=-1;
			rear=-1;
		}
		
		public boolean isFull() {
			return (rear == size -1);
		}
		
		public boolean isEmpty() {
			return (front==-1 || front > rear);
		}
		
		public void queue(Object newItem) {
			ensureCapacity(rear+2); // plus 2 because we start from -1
			rear=rear+1;
			arrayQueue[rear]=newItem;
			
			if(front==-1) {
				front=0;
			}
		}
		
		public T deQueue() {
			if(isEmpty()) {
				System.out.println("The queue is empty");
				return null;
			}
			T objectOut = (T) arrayQueue[front];
			front=front+1;
			return objectOut;
		}
		
		public int getSize() {
			return arrayQueue.length;
		}
		
		public void ensureCapacity(int minCapacity) {
			int oldCapacity=getSize();
			if(minCapacity>oldCapacity) {
				int newCapacity=oldCapacity*2;

				if(newCapacity<minCapacity)
					newCapacity=minCapacity;
				
				arrayQueue=Arrays.copyOf(arrayQueue, newCapacity);
			}
		}


}
