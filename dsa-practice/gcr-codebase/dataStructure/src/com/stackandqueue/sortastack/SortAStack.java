package com.stackandqueue.sortastack;

public class SortAStack {
	
	StackNode top;
	
	public void push(int data) {
		StackNode newNode = new StackNode(data);
		newNode.next = top;
		top = newNode;
	}
	
	public StackNode pop() {
		if(top == null) {
			System.out.println("Stack underflow....");
			return null;
		}
		
		StackNode s = top;
		top = top.next;
		return s;
	}
	
	public int peek() {
		return top.data;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
}
