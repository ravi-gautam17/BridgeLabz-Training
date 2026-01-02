package com.encapsulation.librarymanagementsystem;

public class DVD extends LibraryItem implements Reservable{
	public DVD(String id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
    	return 3; 
    }
    
    @Override
    public void reserveItem(String memberId) {
        System.out.println("DVD '" + getTitle() + "' reserved for " + memberId);
    }

    @Override
    public boolean checkAvailability() { 
    	return !isLoaned; 
    }
}
