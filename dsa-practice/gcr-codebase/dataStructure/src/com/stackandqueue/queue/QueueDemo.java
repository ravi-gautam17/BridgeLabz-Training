package com.stackandqueue.queue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue = new Queue();
		
		queue.enqueue(1);
		queue.enqueue(2);
		queue.dequeue();
		queue.enqueue(3);
		queue.dequeue();
		queue.dequeue();
	}

}
