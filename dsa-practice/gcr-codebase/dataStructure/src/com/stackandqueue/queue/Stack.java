package com.stackandqueue.queue;

public class Stack {
	StackNode top;
	
	public void push(int data) {
		StackNode newNode = new StackNode(data);
		newNode.next = top;
		top = newNode;
		System.out.println("Element Added Sucessfully");
	}
	
	public StackNode pop() {
		if(top==null) {
			System.out.println("Stack Underflow!");
			return null;
		}
		StackNode s = top;
		top = top.next;
		
		return s;
	}
	
	public StackNode top() {
		return top;
	}
	
	public boolean isEmpty() {
		return top==null;
	}
}
