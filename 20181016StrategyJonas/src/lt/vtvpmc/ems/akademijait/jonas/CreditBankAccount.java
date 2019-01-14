package lt.vtvpmc.ems.akademijait.jonas;

public class CreditBankAccount extends BankAccount{

    //private String number;
    //private double balance;
    private double creditLimit;


    //konstruktorius
    public CreditBankAccount(String number){
        super(number);

    }

    public CreditBankAccount(String number, InterestStrategy interestStrategy){
        super( number, interestStrategy);
    }


    public CreditBankAccount(String number, double creditLimit){
        super(number);
        this.creditLimit = creditLimit;
    }


    @Override
    public void debit(double amount) {
        this.balance -= amount;
        System.out.println(this.balance);

        /*if(this.balance + this.creditLimit - amount >= 0){
            this.balance -= amount;
        }*/



    }
}
