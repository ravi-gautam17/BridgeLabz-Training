package junit.AdvancedJunitTesting.bankAccount;

public class InsuffiecientBalanceException extends Exception{
	
	public InsuffiecientBalanceException(String message) {
		super(message);
	}
}
