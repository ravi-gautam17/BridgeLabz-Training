package com.encapsulation.bankingsystem;

public class SavingsAccount extends BankAccount implements Loanable{
	private double interestRate = 0.05; 

    public SavingsAccount(String accNo, String name, double bal) {
        super(accNo, name, bal);
    }

    @Override
    public void calculateInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest added to Savings: $" + interest);
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            System.out.println("Loan of $" + amount + " approved for " + getHolderName());
        } else {
            System.out.println("Loan denied: Balance must be over $5000.");
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        return balance >= 5000;
    }
}
