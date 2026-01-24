package collections.queueinterface.hospitaltriagesystem;

import java.util.PriorityQueue;

public class PatientsDemo {
  public static void main(String[] args) {
	  PriorityQueue<Patient> pq=new PriorityQueue<>((a,b)-> b.severity-a.severity );
	  
	  pq.add(new Patient("Ravi",2));
	  pq.add(new Patient("Vedansh",3));
	  pq.add(new Patient("Ashish",1));
	  
	  while(!pq.isEmpty()) {
		  Patient p=pq.poll();
		  System.out.println(p.name);
	  }
  }
}
