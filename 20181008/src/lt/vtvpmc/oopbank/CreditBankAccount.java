package lt.vtvpmc.oopbank;

public class CreditBankAccount extends BankAccount{

    //private String number;    // nebereikia po to kai paveldeta per extends
    //private double balance;   // nebereikia po to kai paveldeta per extends

    private double creditLimit;

    private InterestStrategy interestStrategy;  //=======INTERFEISAS======== (idedam strategija į klasę)

    //konstruktorius (numato kad saskaita privalo tureti numeri)
    public CreditBankAccount(String number) {
         super(number);
    }

    //konstruktorius kitas (numato, kad saskaita privalo tureti numeri ir kredito limita)
    public CreditBankAccount(String number, double creditLimit) {
        super(number);
        this.creditLimit = creditLimit;
    }

    //konstruktorius trecias (numato, kad saskaita privalo tureti dar ir palukanu strategija) //=======INTERFEISAS========
    public CreditBankAccount(String number, double creditLimit, InterestStrategy interestStrategy) {
        super(number);
        this.creditLimit = creditLimit;
        this.interestStrategy = interestStrategy;
    }

    @Override   // tevines klases debito metodo perrasymas (papildomai ivertina ir kredito limita)
    public void debit(double amount) {
        if (this.balance + this.creditLimit - amount >= 0) {
            this.balance -= amount;
        }
        }

    //======= INTERFEISAS (PATTERN) ========
    @Override // tevines klases credito metodo perrasymas (papildomai ivertina ir palukanas)
    public void credit(double amount) {
        //double interest = interestStrategy.applyInterest(this.balance);
        //this.balance += amount - interest;
        this.balance += interestStrategy.applyInterest(amount, this.balance);
    }

}
