package lt.vtvpmc.logging;

public class InsufficientBalanceException extends BankException {
    private double currentBalance;
    private double withdrawalAmount;

    public InsufficientBalanceException(double currentBalance, double withdrawalAmount) {
        super(
            String.format(
                    "Insufficient balance. Tried withdrawing %f with the current balance of %f",
                    withdrawalAmount,
                    currentBalance
            )
        );

        this.currentBalance = currentBalance;
        this.withdrawalAmount = withdrawalAmount;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public double getWithdrawalAmount() {
        return withdrawalAmount;
    }
}
