package com.constructors.levelone;

public class Book {
   private String title;
   private  String author;
   private double price;
   public Book(){
	   System.out.println("Book constructor called");
   };
   public Book(String title, String author,double price){
       this.title=title;
       this.author=author;
       this.price=price;
   }
   public void show(){
	   System.out.println("Title: "+this.title);
	   System.out.println("Author: "+this.author);
	   System.out.println("Price: "+this.price);
	   
   }
   public static void main(String[] args) {
	   Book obj1=new Book();
	   Book obj2=new Book("Ramayana","Valmiki",1000.0);
	   obj2.show();
	   
	   
   }
   
}
