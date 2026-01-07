package com.stackandqueue.stockspanproblem;

public class Stack {
	
	StackNode top;
	
	public void push(int[] data) {
		StackNode newNode = new StackNode(data);
		newNode.next = top;
		top = newNode;
	}
	
	public int[] pop() {
		if(top == null) {
			return new int[] {0, 0};
		}
		
		int val[] = top.data;
		top = top.next;
		return val;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public int[] peek() {
		return top.data;
	}
}
