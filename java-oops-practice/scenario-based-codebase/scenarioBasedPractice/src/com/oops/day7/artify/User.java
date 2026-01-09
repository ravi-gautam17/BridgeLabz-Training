package com.oops.day7.artify;

public class User {
    String name;
    private double walletBalance;
    
    public User(String name,double walletBalance) {
          this.name=name;
          this.walletBalance=walletBalance;
    }
    
    public double getWalletBalance() {
    	return this.walletBalance;
    	
    }
    public boolean hasSufficientBalance(double price) {
    	if(price<walletBalance) {
    		return true;
    	}
    	return false;
    }
    public void deductBalance(double amount) {
    	walletBalance-=amount;
    }
    public void addBalance(double amount) {
    	walletBalance+=amount;
    }
}
