package com.inheritance.hierarchicalinheritance.bankaccount;

public class BankAccountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingsAccount s1 = new SavingsAccount("SBI101", 25000, 12);
		s1.displayAccountType();
		
		CheckingAccount c1 = new CheckingAccount("CBI125", 120000, 20000);
		c1.displayAccountType();
		
		FixedDepositAccount f1 = new FixedDepositAccount("AX1022", 32000);
		f1.displayAccountType();
		
	}

}
