package com.ds.stackarrayimplementation;

public class StackArray<T> {
	Object[] arrayStack;
	int size;
	int top;
	
	public StackArray(int size) {
		this.size = size;
		arrayStack = new Object[this.size];
		top = -1;
	}
	
	public void push(Object newItem) {
		if(!isFull()) {
			top +=1;
			arrayStack[top]= newItem;
		}else {
			System.out.println("Stack is full");
		}
	}
	
	public Boolean isFull() {
		return size-1==top;
	}
	
	public T pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return null;
		}
		T item = (T) arrayStack[top];
		top=top-1;
		return item;
		
	}
	
	public Boolean isEmpty() {
		return top == -1;
	}
}
