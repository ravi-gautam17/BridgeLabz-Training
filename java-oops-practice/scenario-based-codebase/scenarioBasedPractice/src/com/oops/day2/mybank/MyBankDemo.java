package com.day2.mybank;

public class MyBankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Account savings = new SavingsAccount("SB101", "Ravi", 10000);
		 Account savings2 = new SavingsAccount("SB101", "Swaraj");
		 Account current = new CurrentAccount("CA201", "Ashish", 15000);

		 savings2.setBalance(2000);
		 current.withdraw(3000);

		 System.out.println("Savings Balance: " + savings.checkBalance());
		 System.out.println("Savings Interest: " + savings.calculateInterest());
		 System.out.println("...........................");
		 
		 System.out.println("Savings Balance: " + savings2.checkBalance());
		 System.out.println("Savings Interest: " + savings2.calculateInterest());
		 System.out.println("...........................");

		 System.out.println("Current Balance: " + current.checkBalance());
		 System.out.println("Current Interest: " + current.calculateInterest());
	}

}
