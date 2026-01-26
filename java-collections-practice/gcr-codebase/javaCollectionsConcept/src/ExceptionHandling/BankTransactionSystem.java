package ExceptionHandling;
import java.util.*;

class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException() {
		super("Insufficient balance!");
	}
}

public class BankTransactionSystem {
	
	private double balance;
	private String accountNo;
	private String name;
	
	public BankTransactionSystem(String accNo, String name, double balance) {
		this.accountNo = accNo;
		this.name = name;
		this.balance =balance;
	}
	
	public void withdraw(double amount) throws InsufficientBalanceException{
		
		if(amount>balance)
			throw new InsufficientBalanceException();
		else if(amount<0)
			throw new IllegalArgumentException("Invalid amount!");
		else {
			balance-=amount;
			System.out.println("Money withdraw sucessfull!");
			System.out.println("Your current balance: "+balance);
		}
	}
	public void creditAmount(double amount) throws IllegalArgumentException{
		if(amount<0)
			throw new IllegalArgumentException("Invalid amount!");
		balance+=amount;
	}
	public void displayAccountDetaile() {
		System.out.println("Account number: "+accountNo+"\nname: "+
	name+"\naccount balance: "+balance);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			BankTransactionSystem acc = new BankTransactionSystem("1234", "Nageshwar", 2000);
			System.out.println("Enter operation you want to perform: ");
			System.out.println("1. Display account details");
			System.out.println("2. Withdraw money");
			System.out.println("3. add money");
			System.out.print("\nEnter your choice: ");
			int n = sc.nextInt();
			double amount;
			
			switch(n) {
			case 1:
				acc.displayAccountDetaile();
				break;
			case 2:
				System.out.print("Enter amount to withdraw: ");
				amount = sc.nextDouble();
				acc.withdraw(amount);
				break;
			case 3: 
				System.out.print("Enter amount to add: ");
				amount = sc.nextDouble();
				acc.creditAmount(amount);
				break;
			default: 
				System.out.println("Invalid choice!");
			}
		}
		catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
