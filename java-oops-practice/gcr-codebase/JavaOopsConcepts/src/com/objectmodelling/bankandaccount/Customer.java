package com.objectmodelling.bankandaccount;

import java.util.ArrayList;

public class Customer {
    private int customerId;
    private String name;
    private ArrayList<Account> accounts;

    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    // Communication method
    public void viewBalance() {
        System.out.println("Customer Name: " + name);

        for (Account acc : accounts) {
            System.out.println("Account No: " + acc.getAccountNumber() +
                    ", Bank: " + acc.getBank().getBankName() +
                    ", Balance: ₹" + acc.getBalance());
        }
    }
}
