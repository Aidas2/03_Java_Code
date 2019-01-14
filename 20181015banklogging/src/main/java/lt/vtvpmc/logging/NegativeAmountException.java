package lt.vtvpmc.logging;

public class NegativeAmountException extends BankException {
    private double amountAttempted;

    public NegativeAmountException(double amountAttempted) {
        // We don't care about different messages, so we will just set a fixed one.
        super("Attempted to supply negative amount: " + amountAttempted);
        this.amountAttempted = amountAttempted;
    }

    public double getAmountAttempted() {
        return amountAttempted;
    }
}
