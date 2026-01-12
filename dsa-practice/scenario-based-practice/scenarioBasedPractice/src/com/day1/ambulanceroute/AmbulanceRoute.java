package com.day1.ambulanceroute;

public class AmbulanceRoute {
    Unit head=null;
    
    public void addUnit(String name,boolean available) {
    	Unit newUnit=new Unit(name,available);
    	if(head!=null) {
    		Unit temp=head;
    		while(temp.next!=head) {
    			temp=temp.next;
    		}
    		temp.next=newUnit;
    		newUnit.next=head;
    	}
    	else {
    		head=newUnit;
    		newUnit.next=head;
    	}
    }
    public void findAvailableUnit() {
    	 if(head==null) {
    		 System.out.println("No hospital unit available");
    		 return;
    	 }
    	 Unit temp=head;
    	 do {
    		 if(temp.available) {
    			 System.out.println("Patient redirected to: "+temp.name);
    		 }
    		 temp=temp.next;
    		 
    	 }while(temp!=head);
    	 
    }
    public void removeUnit(String name) {
    	 if(head==null) {
    		 return;
    	 }
    	 Unit temp=head;
    	 Unit prev=null;
    	 do {
    		 if(temp.name.equals(name)) {
    			 if(temp==head) {
    				 Unit last=head;
    				 while(last.next!=head) {
    					 last=last.next;
    				 }
    				 head=head.next;
    				 last.next=head;
    						 
    			 }else {
    				 prev.next=temp.next;
    			 }
    			 System.out.println(temp.name +" Removed for maintenance");
    		 }	
    		 prev=temp;
    		 temp=temp.next;
    		 
    	 }while(temp!=head);
    }
}
