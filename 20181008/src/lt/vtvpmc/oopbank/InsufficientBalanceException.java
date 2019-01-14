package lt.vtvpmc.oopbank;

public class InsufficientBalanceException extends Exception {

    private double currentBalance;
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
