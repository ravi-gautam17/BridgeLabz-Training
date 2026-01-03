package com.encapsulation.bankingsystem;

public class CurrentAccount extends BankAccount{
	public CurrentAccount(String accNo, String name, double bal) {
        super(accNo, name, bal);
    }

    @Override
    public void calculateInterest() {
        System.out.println("Current Account processed: No interest applied.");
    }
}
