package com.inheritance.hierarchicalinheritance.bankaccount;

public class SavingsAccount extends BankAccount{
	private int interestRate;
	
	public SavingsAccount(String accountNumber, double balance, int interestRate) {
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}
	
	public void displayAccountType() {
		System.out.println("Account Type: Savings Account");
	}
}
