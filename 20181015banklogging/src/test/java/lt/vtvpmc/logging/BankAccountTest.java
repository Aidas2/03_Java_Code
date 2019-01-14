package lt.vtvpmc.logging;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

public class BankAccountTest {

    @Test
    public void shouldHaveNumberAndBalance() {
        BankAccount bankAccount = new BankAccount("LT1234");

        assertEquals("LT1234", bankAccount.getName());
        assertEquals(0.0, bankAccount.getBalance());
    }

    // We add throws to the test as we are fine with "JUnit catching the exception". If the
    // exception is thrown JUnit will catch and fail the test. But here we expect no exception
    // to be thrown and our balance to be increased by the given amount.
    @Test
    public void shouldAllowDepositing() throws NegativeAmountException {
        BankAccount bankAccount = new BankAccount("");

        bankAccount.deposit(50.0);

        assertEquals(50.0, bankAccount.getBalance(), 0.01);
    }

    @Test
    public void shouldNotAllowDepositingNegativeAmounts() {
        BankAccount bankAccount = new BankAccount("");


        try {
            bankAccount.deposit(-20.0);
            fail("No exception thrown"); // If line above did not throw the exception - fail the test
        } catch (NegativeAmountException ex) {
            // Check if the value carried is the correct one.
            // We expect that the exception will have the value we tried to deposit.
            assertEquals(-20.0, ex.getAmountAttempted());
        } catch (Exception ex) {
            // Fail above is not sufficient as try block, could have been interrupted by a different exception
            // than the one we are expecting
            // Catching Exception type will catch any other exception that could have been thrown (but not Errors)
            fail("Wrong exception thrown");
        }
    }

    // A JUnit 5 canonical way of testing if exception is thrown
    // It tests the same thing as the test above, but with a different syntax.
    @Test
    public void shouldNotAllowDepositingNegativeAmountsNewWay() {
        BankAccount bankAccount = new BankAccount("");

        // Assert throws checks if expected exception is thrown in the code passed in.
        // It will return the exception caught. If no exception is cought it will fail
        // the test (which is actually just throwing an exception).
        NegativeAmountException ex = assertThrows(
                NegativeAmountException.class,
                () -> bankAccount.deposit(-20.0)
        );

        // We check if the data in exception is correct
        assertEquals(-20.0, ex.getAmountAttempted(), 0.01);
    }

    @Test
    public void shouldAllowWithdrawingFunds() throws NegativeAmountException, InsufficientBalanceException {
        BankAccount bankAccount = new BankAccount("");

        bankAccount.deposit(50.0);

        bankAccount.withdraw(10.0);

        assertEquals(40.0, bankAccount.getBalance(), 0.01);
    }

    @Test
    public void shouldThrowNegativeAmountExceptionIfNegativeAmountIsPassed() {
        BankAccount bankAccount = new BankAccount("");

        NegativeAmountException ex = assertThrows(
            NegativeAmountException.class,
            () -> bankAccount.withdraw(-30.0)
        );

        assertEquals(-30.0, ex.getAmountAttempted(), 0.01);
    }

    // Instead of declaring:
    //   throws NegativeAmountException, InsufficientBalanceException
    // We can declare throws BankException as both exceptions inherit from BankException
    @Test
    public void shouldThrowInsufficientBalanceExceptionWhenWithdrawingMoreThanABalance() throws BankException {
        BankAccount bankAccount = new BankAccount("");

        bankAccount.deposit(5.0);

        InsufficientBalanceException ex = assertThrows(
            InsufficientBalanceException.class,
            () -> bankAccount.withdraw(10.0)
        );

        assertEquals(5.0, ex.getCurrentBalance(), 0.01);
        assertEquals(10.0, ex.getWithdrawalAmount(), 0.01);
    }
}
