package com.day1.browserbuddy;

public class UseBrowserBuddy {
   public static void main(String[] args) {
	   BrowserBuddy browser=new BrowserBuddy();
	   browser.openTab("google.com");
	   
	   browser.currentTab.visitPage("stackoverflow.com");
	   browser.currentTab.visitPage("geeksforgeeks");
	   browser.currentTab.getCurrentPage();
	   browser.currentTab.visitPage("myntra.com");
	   browser.currentTab.getCurrentPage();
	   
	   browser.currentTab.goBack();
	   browser.currentTab.getCurrentPage();
	   
	   browser.currentTab.goForward();
	   browser.currentTab.getCurrentPage();
	   
	   browser.closeTab();
	   browser.restoreTab();
	   
	   browser.currentTab.getCurrentPage();
	   
   }
}
