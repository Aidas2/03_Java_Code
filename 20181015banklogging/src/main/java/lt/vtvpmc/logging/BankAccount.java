package lt.vtvpmc.logging;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankAccount {

    private static final Logger logger = LoggerFactory.getLogger(BankAccount.class);

    private String name;

    private double balance;

    public BankAccount(String name) {
        this.name = name;
    }

    public void deposit(double amount) throws NegativeAmountException {
        // If amount is negative we throw the exception.
        // As we don't handle it here (as the point is to have callers of the
        // deposit method to handle it), we declare "throws" next to the method signature.
        if (amount < 0) {
            logger.error("Negative amount supplied to deposit: {}", amount);
            throw new NegativeAmountException(amount);
        }

        this.balance += amount;
        logger.info("{} deposited to {}", amount, this.name);
    }

    public void withdraw(double amount) throws NegativeAmountException, InsufficientBalanceException {
        if (amount < 0) {
            logger.error("Negative amount supplied for withdrawal {} from account {}", amount, this.name);
            throw new NegativeAmountException(amount);
        }
        if (this.balance < amount) {
            logger.warn("Tried withdrawing more than the current balance, amount = {}, current balance = {}, account = {}", amount, this.balance, this.name);
            throw new InsufficientBalanceException(this.balance, amount);
        }

        this.balance -= amount;
        logger.info("{} withdrawn from {}", amount, this.name);
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
}
