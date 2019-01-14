package lt.vtvpmc.ems.akademijait.jonas;

public class BankAccount{

    protected String number;
    protected double balance;

    protected InterestStrategy interestStrategy;

    //konstruktorius
    public BankAccount(String number){
        this.number = number;
    }

    //konstruktorius su palukanu startegija
    public BankAccount (String number, InterestStrategy interestStrategy){
        this.number = number;
        this.interestStrategy = interestStrategy;
    }



    public void credit(double amount) {
        if(amount > 0){
            double interest = interestStrategy.applyInterest(this.balance);
            this.balance += amount - interest;

        }

    }

    public void debit(double amount) {
       /* if(this.balance - amount >= 0){
            this.balance -= amount;
        }*/
        this.balance -= amount;

    }

    public double getBalance(){
        return this.balance;
    }

    public String getNumber(){
        return this.number;
    }

}
