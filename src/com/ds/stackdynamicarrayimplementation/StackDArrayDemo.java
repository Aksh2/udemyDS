package com.ds.stackdynamicarrayimplementation;

public class StackDArrayDemo {
	public static void main(String args[]) {
		StackDArray<Integer> st = new StackDArray<Integer>(2);
		st.push(12);
		st.push(12);
		System.out.println(st.getSize());
		st.push(12);
		System.out.println(st.getSize());
	}
}
