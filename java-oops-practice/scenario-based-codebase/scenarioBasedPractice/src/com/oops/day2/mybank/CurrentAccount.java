package com.day2.mybank;

public class CurrentAccount extends Account{
	
	public final static double interestRate = 2;
	
	// with opening balance
	CurrentAccount(String accountNumber, String holderName, double balance){
		super(accountNumber, holderName, balance);
	}
		
	// without opening balance
	CurrentAccount(String accountNumber, String holderName){
		super(accountNumber, holderName);
	}
		
	@Override
	public double calculateInterest() {
		return  (checkBalance() * interestRate) / 100;
	}
}
