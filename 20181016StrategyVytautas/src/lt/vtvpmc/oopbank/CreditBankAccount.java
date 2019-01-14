package lt.vtvpmc.oopbank;


public class CreditBankAccount extends BankAccount {

    private InterestStrategy creditStrategy;

    private double creditLimit;



    public CreditBankAccount(String number) {
        super(number);
    }

    public CreditBankAccount(String number, double creditLimit) {
        super(number);
        this.creditLimit = creditLimit;
    }


    public CreditBankAccount(String number, double creditLimit, InterestStrategy creditStrategy) {
        super(number);
        this.creditLimit = creditLimit;
        this.creditStrategy = creditStrategy;
    }

    @Override
    public void debit(double amount) {
        if (this.balance - amount >=  -this.creditLimit) {
            this.balance -= amount;
        }
    }

    @Override
    public void credit(double amount){
        this.balance += creditStrategy.applyInterest(amount, this.balance);
    }

}
