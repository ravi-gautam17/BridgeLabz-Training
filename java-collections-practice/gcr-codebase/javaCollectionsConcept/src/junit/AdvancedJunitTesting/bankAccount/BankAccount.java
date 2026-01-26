package junit.AdvancedJunitTesting.bankAccount;

public class BankAccount {
	private String name;
	private String accNo;
	private double balance;
	
	public BankAccount(String accNo, String name) {
		this.name = name;
		this.accNo = accNo;
	}
	
	public void withDraw(double amount) throws InsuffiecientBalanceException {
		if(amount>balance)
			throw new InsuffiecientBalanceException("Insufficient balance");
		else {
			balance-=amount;
			System.out.println(amount+" withdrawn from your account");
		}	
	}
	
	public void deposit(double amount) throws IllegalArgumentException{
		if(amount<0)
			throw new IllegalArgumentException("amount cannot be negative");
		balance+=amount;
		System.out.println(amount+" added to your account");	
	}
	
	public double getBalance() {
		return balance;
	}
	
	@Override
	public String toString() {
		return "account no: "+accNo
				+"\nName: "+name
				+"\nAccount balance: "+balance;
	}
}