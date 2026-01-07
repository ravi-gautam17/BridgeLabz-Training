package com.day2.mybank;

public abstract class Account implements ITransaction {
	protected String accountNumber;
	private String holderName;
	private double balance;
	
	// with opening balance
	public Account(String accountNumber, String holderName, double balance) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}
	
	// without opening balance
	public Account(String accountNumber, String holderName) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = 0;
	}
	
	@Override
	public double checkBalance() {
		return balance;
	}
	
	@Override
	public void deposit(double amount) {
		if(amount <= 0)
			System.out.println("OOPS, Invalid Amount...");
		else
		{
			balance += amount;
			System.out.println("Amount Deposit Successfully");
		}
	}
	
	@Override
	public void withdraw(double amount) {
		if(amount > balance)
			System.out.println("OOPS, Insufficient Balance...");
		else
		{
			balance -= amount;
			System.out.println("Amount Withdraw Successfully");
		}
	}
	
	protected void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	// abstract method
	public abstract double calculateInterest();
}
