package collections.queueinterface.circularbuffersimulation;

public class CircularBuffer {
    int[] buffer;
    int front;
    int rear;
    int size;
    int capacity;
   
    public CircularBuffer(int capacity) {
    	this.capacity=capacity;
        buffer=new int[capacity];
        front=0;
        rear=0;
        size=0;
    }
    public void enqueue(int x) {
    	if(size==capacity) {
    		front=(front+1)%capacity;
    	}
    	else {
    		size++;
    	}
    	
    	buffer[rear%capacity]=x;
    	rear=(rear+1)%capacity;
    	
    }
    public int dequeue() {
    	int val=buffer[front];
    	front=(front+1)%capacity;
    	size--;
    	return val;
    }
    public void display() {
    	for(int i=0;i<size;i++) {
    		
    		System.out.print(buffer[(front+i)%capacity]+" ");	    		
    	}
    	System.out.println();
    	
    }
    
}
