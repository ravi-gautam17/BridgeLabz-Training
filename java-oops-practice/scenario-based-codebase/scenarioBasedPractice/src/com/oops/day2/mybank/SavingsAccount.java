package com.day2.mybank;

public class SavingsAccount extends Account{
	private final static double interestRate = 7;  // 7% in savings account
	
	// with opening balance
	SavingsAccount(String accountNumber, String holderName, double balance){
		super(accountNumber, holderName, balance);
	}
	
	// without opening balance
	SavingsAccount(String accountNumber, String holderName){
		super(accountNumber, holderName);
	}
	
	@Override
	public double calculateInterest() {
		return  (checkBalance() * interestRate) / 100;
	}
}
