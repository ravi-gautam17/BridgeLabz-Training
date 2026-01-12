package com.day1.browserbuddy;

public class Tab {
     
     Page head;
     Page current;
     
     public Tab(String url) {
    	Page page=new Page(url);
    	head=page;
    	current=page;
     }
     
     public void visitPage(String url) {
    	 Page newPage=new Page(url);
    	 current.next=newPage;
    	 newPage.prev=current;
    	 current=newPage;
        
    	 
     }
     public void goBack() {
    	 if(current.prev!=null) {
    		 current=current.prev;
    		 
    	 }
    	 else {
    		 System.out.println("No page found");
    	 }
     }
     public void goForward() {
    	 if(current.next!=null) {
    		 current=current.next;
    		 
    	 }
    	 else {
    		 System.out.println("No page found");
    	 }
     }
     public void getCurrentPage() {
    	 System.out.println(current.url);
     }
}
