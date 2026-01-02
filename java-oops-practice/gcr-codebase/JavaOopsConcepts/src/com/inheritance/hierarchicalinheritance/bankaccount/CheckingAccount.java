package com.inheritance.hierarchicalinheritance.bankaccount;

public class CheckingAccount extends BankAccount{
	
	private long withdrawalLimit;
	
	public CheckingAccount(String accountNumber, double balance, int withdrawalLimit) {
		super(accountNumber, balance);
		this.withdrawalLimit = withdrawalLimit;
	}
	
	public void displayAccountType() {
		System.out.println("Account Type: Checking Account");
	}
}
