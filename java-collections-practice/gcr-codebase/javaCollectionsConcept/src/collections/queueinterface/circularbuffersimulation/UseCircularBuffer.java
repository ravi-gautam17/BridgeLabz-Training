package collections.queueinterface.circularbuffersimulation;

public class UseCircularBuffer {
   public static void main(String[] args) {
	   CircularBuffer cb=new CircularBuffer(3);
	   cb.enqueue(10);
	   cb.enqueue(20);
	   cb.display();
	   cb.enqueue(30);
	   cb.display();
	   cb.enqueue(40);
	   cb.display();
	   cb.dequeue();
	   cb.display();
	   
   }
}
