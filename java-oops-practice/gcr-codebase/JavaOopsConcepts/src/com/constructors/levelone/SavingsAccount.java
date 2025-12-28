package com.constructors.levelone;

public class SavingsAccount extends BankAccount {

    double interestRate;

    // Constructor
    SavingsAccount(long accountNumber, String accountHolder,
                   double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Method demonstrating access modifiers
    void displaySavingsAccountDetails() {
        System.out.println("Account Number  : " + accountNumber);   // public
        System.out.println("Account Holder  : " + accountHolder);   // protected
        System.out.println("Balance         : " + getBalance());    // private via getter
        System.out.println("Interest Rate   : " + interestRate + "%");
    }
}
