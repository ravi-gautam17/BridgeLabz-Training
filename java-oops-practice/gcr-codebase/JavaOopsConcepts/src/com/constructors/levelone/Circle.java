package com.constructors.levelone;

public class Circle {
	   private double radius;
	  
	   // constructor chaining
	   Circle(){
		   this(5);
	   };
	   Circle(double radius){
		 this.radius=radius;   
	   }
	   // show method implementation
	   public void show(){
		   System.out.println("Radius: "+this.radius);
		   
	   }
	   public static void main(String[] args) {
		   // Create the objects of Circle
		   Circle obj1=new Circle();
		   Circle obj2=new Circle(5.5);
		   obj1.show();
		   obj2.show();
		   	   
	   }
	   
	}

