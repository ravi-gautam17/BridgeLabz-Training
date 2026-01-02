package com.encapsulation.librarymanagementsystem;

public abstract class LibraryItem {
	private String itemId;
	private String title;
	private String author;
	private String borrowerId; 
    protected boolean isLoaned;
	
	public LibraryItem(String itemId, String title, String author) {
		this.itemId = itemId;
		this.title = title;
		this.author = author;
		this.isLoaned = false;
	}
	
	public String getItemDetails() {
		return "[" + itemId + "] " + title + " by " + author;
	}
	
	public abstract int getLoanDuration();
	
	public String getTitle() { return title; }
    public String getBorrowerId() { return borrowerId; }
    
    public void setBorrowerId(String borrowerId) {
        this.borrowerId = borrowerId;
        this.isLoaned = (borrowerId != null);
    }
}
