package com.day1.browserbuddy;

import java.util.Stack;

public class BrowserBuddy {
    Stack<Tab> closedTabs=new Stack<>();
    
    Tab currentTab;
    
    public void openTab(String url) {
        currentTab=new Tab(url);
        System.out.println("Tab opened successfully");
    }
    public void closeTab() {
    	if(currentTab!=null) {
    		closedTabs.push(currentTab);
    		currentTab=null;
    		System.out.println("Tab closed");
    	}
    }
    public void restoreTab() {
    	if(!closedTabs.isEmpty()) {
    		Tab t=closedTabs.pop();
    		currentTab=t;
    		
    	}
    	
    }
    
    
}
