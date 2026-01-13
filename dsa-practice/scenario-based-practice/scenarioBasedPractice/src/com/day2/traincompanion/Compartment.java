package com.day2.traincompanion;

import java.util.*;

public class Compartment {
   String compartmentName;
   List<Service> services;
   Compartment prev;
   Compartment next;
   public Compartment(String name) {
	   this.compartmentName=name;
	   this.prev=null;
	   this.next=null;
	   services=new ArrayList<>();
   }
 
}
