package com.encapsulation.bankingsystem;

public class BankingSystemDemo {
	public static void main(String[] args) {
        
        BankAccount saving = new SavingsAccount("SA123", "Ravi", 6000.0);
        BankAccount current = new CurrentAccount("CA456", "Vedansh", 2000.0);

        BankAccount[] bankDB = { saving, current };

        System.out.println("--- Monthly Account Processing ---");
        for (BankAccount acc : bankDB) {
            acc.calculateInterest();
            System.out.println(acc.getHolderName() + " Balance: $" + acc.getBalance());
            System.out.println("-------------------------");
        }

        System.out.println("--- Loan Application Process ---");
        if (saving instanceof Loanable) {
            ((Loanable) saving).applyForLoan(10000);
        }
    }
}
