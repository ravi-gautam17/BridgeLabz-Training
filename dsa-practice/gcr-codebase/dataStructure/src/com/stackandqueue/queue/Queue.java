package com.stackandqueue.queue;

public class Queue {
	Stack s1 = new Stack();
	Stack s2 = new Stack();
	
	public void enqueue(int data) {
		s1.push(data);
	}
	
	public void  dequeue() {
		if(s1.isEmpty() && s2.isEmpty()) {
			System.out.print("Queue is empty");
		}
		
		if(s2.isEmpty()) {
			while(!s1.isEmpty()) {
				s2.push(s1.pop().data);
			}
		}
		
		System.out.println("element deleted sucessfully: "+s2.pop().data);
	}
}
