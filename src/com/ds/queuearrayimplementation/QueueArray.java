package com.ds.queuearrayimplementation;

public class QueueArray<T> {
	Object[] arrayQueue;
	int rear;
	int front;
	int size;

	public QueueArray(int size) {
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
		if(isFull()) {
			System.out.println("Queue is full");
			return;
		}
		
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

}
