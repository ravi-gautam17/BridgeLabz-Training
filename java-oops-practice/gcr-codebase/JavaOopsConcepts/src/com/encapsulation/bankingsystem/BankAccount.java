package com.encapsulation.bankingsystem;

public abstract class BankAccount {
	
	private String accountNumber;
	private String holderName;
	protected double balance;
	
	public BankAccount(String accountNumber, String holderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialBalance;
    }
	
	public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " to " + holderName + ". New Balance: $" + balance);
        }
	}
	
	public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from " + holderName + ". New Balance: $" + balance);
        } else {
            System.out.println("Transaction failed for " + holderName + ": Insufficient funds.");
        }
    }
	
	public abstract void calculateInterest();

    
    public String getHolderName() { 
    	return holderName; 
    }
    public double getBalance() {
    	return balance; 
    }
}
