package com.constructors.levelone;

public class LibraryBookSystem {
    private String title;
    private String author;
    private double price;
    private boolean availability;
   
    public LibraryBookSystem(String title,String author,double price,boolean availability){
 	   this.title=title;
 	   this.author=author;
 	   this.price=price;
 	   this.availability=availability;
    }
    public void checkAvailability() {
    	  if(availability) {
    		  System.out.println("Author : "+this.author);
    		  System.out.println("Title : "+this.title);
    		  System.out.println("Price : "+this.price);
    		  
    	  }
    	  else {
    		  System.out.println("Book Not available");
    	  }
    }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
        LibraryBookSystem obj1=new LibraryBookSystem("Girl in the room 102","Chetan Bhagat",250,false);
        obj1.checkAvailability();
        LibraryBookSystem obj2=new LibraryBookSystem("My experiment with truth","Mahatma Gandhi",300,true);
        obj2.checkAvailability();
	}

}
