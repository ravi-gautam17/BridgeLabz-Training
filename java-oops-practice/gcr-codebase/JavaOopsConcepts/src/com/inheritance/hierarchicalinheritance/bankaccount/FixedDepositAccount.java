package com.inheritance.hierarchicalinheritance.bankaccount;

public class FixedDepositAccount extends BankAccount{
		
	public FixedDepositAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}
	
	public void displayAccountType() {
		System.out.println("Account Type: FixedDeposit Account");
	}
}
