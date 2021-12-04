package com.ds.doublylinkedlist;

public class NodeD {
	public Object value;
	public NodeD next;
	public NodeD previous;
		public NodeD(Object value,NodeD next,NodeD previous) {
			this.value=value;
			this.next=next;
			this.previous=previous;
		}
}
