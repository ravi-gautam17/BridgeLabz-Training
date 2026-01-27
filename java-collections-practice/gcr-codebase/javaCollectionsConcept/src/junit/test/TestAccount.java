package junit.AdvancedJunitTesting.bankAccount;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestAccount {
    BankAccount acc;
    
    @BeforeEach
    public void setup() {
        acc = new BankAccount("1234", "Nageshwar");
    }

    @Test
    @DisplayName("Should update balance after a valid deposit")
    public void testSuccessfulDeposit() {
        acc.deposit(5000);
        assertEquals(5000, acc.getBalance(), "Balance should be 5000 after deposit");
    }

    @Test
    @DisplayName("Should throw exception for negative deposit")
    public void testNegativeDeposit() {
        assertThrows(IllegalArgumentException.class, () -> acc.deposit(-100));
    }

    @Test
    @DisplayName("Should update balance after a valid withdrawal")
    public void testSuccessfulWithdrawal() throws InsuffiecientBalanceException {
        acc.deposit(1000);
        acc.withDraw(400);
        assertEquals(600, acc.getBalance(), "Balance should be 600 after withdrawal");
    }

    @Test
    @DisplayName("Should throw InsufficientBalanceException when overdrawing")
    public void testOverdraft() {
        acc.deposit(100);
        assertThrows(InsuffiecientBalanceException.class, () -> acc.withDraw(500));
    }
}