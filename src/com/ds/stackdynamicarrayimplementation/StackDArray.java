package com.ds.stackdynamicarrayimplementation;

import java.util.Arrays;

public class StackDArray<T> {
	Object[] arrayStack;
	int size;
	int top;
	
	public StackDArray(int size) {
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
			ensureCapacity(top+2);
		}
	}
	
	public void ensureCapacity(int minCapacity) {
		int oldCapacity=getSize();
		if(minCapacity>oldCapacity) {
			int newCapacity=oldCapacity*2;

			if(newCapacity<minCapacity)
				newCapacity=minCapacity;
			
			arrayStack=Arrays.copyOf(arrayStack, newCapacity);
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
	
	public int getSize() {
		return arrayStack.length;
	}

}
