package lt.vtvpmc.oopbank;


public class BankAccount {

    protected String number;

    protected double balance;

    public BankAccount(String number) {
        this.number = number;
    }

    public void debit(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
        }
    }
    
    public void credit(double amount) {
        // This - current instance of the object
        // that received the call
        if (amount > 0) {
            this.balance += amount;
        }
    }
    
    public double getBalance() {
        return this.balance;
    }
    
    public String getNumber() {
        return this.number;
    }
    
}
