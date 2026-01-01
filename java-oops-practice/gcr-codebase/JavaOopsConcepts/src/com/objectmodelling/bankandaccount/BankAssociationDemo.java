package com.objectmodelling.bankandaccount;

public class BankAssociationDemo {
    public static void main(String[] args) {

        Bank bank = new Bank("State Bank of India");

        Customer c1 = new Customer(101, "Amit");
        Customer c2 = new Customer(102, "Riya");

        bank.openAccount(c1, 1001, 5000);
        bank.openAccount(c1, 1002, 12000);
        bank.openAccount(c2, 2001, 8000);

        System.out.println();
        c1.viewBalance();

        System.out.println();
        c2.viewBalance();
    }
}
