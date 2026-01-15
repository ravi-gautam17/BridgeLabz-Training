package com.day2.bookshelf;

public class LinkedList {
Node head;
	
	public void insertFromEnd(String title, String author, String isbn) {
		Node newNode = new Node(title, author, isbn);
		
		if(head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = newNode;
	}
	
	public void deleteBook(String booktitle) {
		if(head == null) {
			System.out.println("Nothing to delete....");
			return ;
		}
		
		if(head.title.equals(booktitle)) {
			head = head.next;
			return;
		}
		
		Node temp = head;
		while(temp.next != null && !temp.next.title.equals(booktitle)) {
			temp = temp.next;
		}
		
		if (temp.next == null) {
            System.out.println("Book not found");
            return;
        }

        temp.next = temp.next.next;
	}
	
	public void displayList() {
		if(head == null) {
			System.out.println("List is empty...");
			return;
		}
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.title + " ");
			temp = temp.next;
		}
		System.out.println();
	}
}
