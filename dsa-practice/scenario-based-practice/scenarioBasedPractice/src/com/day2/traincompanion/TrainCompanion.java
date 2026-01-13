package com.day2.traincompanion;

public class TrainCompanion {
   Compartment head;
   Compartment tail;
   
   public void addCompartment(String name) {
	    Compartment c=new Compartment(name);
	    if(head==null) {
	    	head=c;
	    	tail=c;
	    }else {
	    	tail.next=c;
	    	c.prev=tail;
	    	tail=c;
	    }
   }
   public void addService(Compartment compartment,String serviceName) {  
	   if(compartment==null) {
		   System.out.println("Compartment does not exist");
		   return;
	   }
	   compartment.services.add(new Service(serviceName));
	  
   }
   
   public void moveForward(Passenger p) {
	    if (p.currentCompartment.next != null) {
	        String from = p.currentCompartment.compartmentName;
	        p.currentCompartment = p.currentCompartment.next;
	        System.out.println("Moved from " + from +
	                           " to " + p.currentCompartment.compartmentName);
	    } else {
	        System.out.println("You are in the last compartment");
	    }
	}
   public void moveBackward(Passenger p) {
	    if (p.currentCompartment.prev != null) {
	        String from = p.currentCompartment.compartmentName;
	        p.currentCompartment = p.currentCompartment.prev;
	        System.out.println("Moved from " + from +
	                           " to " + p.currentCompartment.compartmentName);
	    } else {
	        System.out.println("You are in the first compartment");
	    }
	}
    public void showAdjacentCompartment(Compartment current) {
    	 if(current.prev!=null) {
    		 System.out.println("Previous : "+current.prev.compartmentName);
    	 }
    	 else {
    		 System.out.println("Previous compartment does not exist");
    	 }
    	 if(current.next!=null) {
    		 System.out.println("Next : "+current.next.compartmentName);
    	 }
    	 else {
    		 System.out.println("Next compartment does not exist");
    	 }
    	 
    }
    public void searchService(String serviceName) {
    	Compartment temp=head;
    	while(temp!=null) {
    		for(Service service:temp.services) {
    			if(service.serviceName.equals(serviceName)) {
    				System.out.println(serviceName +" found in compartment "+temp.compartmentName);
    				return;
    			}
    		}
    		temp=temp.next;
    	}
    	System.out.println("Service does not exist");
    	
    }
   
} 
