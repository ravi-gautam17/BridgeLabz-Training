package com.constructors.levelone;

public class BankAccountManagement {

    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount(
                1234567890L, "Ravi", 25000.0, 4.5
        );

        sa.displaySavingsAccountDetails();

        // Modify balance using public methods
        sa.setBalance(30000.0);
        System.out.println("Updated Balance: " + sa.getBalance());
    }
}
