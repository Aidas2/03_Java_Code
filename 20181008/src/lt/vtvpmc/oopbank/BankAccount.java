package lt.vtvpmc.oopbank;

public class BankAccount {

    protected String number;  //perdarom i privatu kad negaletu niekas kaitalioti (paskui perdarom i protected kad...)

    protected double balance; //perdarom i privatu kad negaletu niekas kaitalioti (paskui perdarom i protected kad...)

    //konstruktorius (nurodo kad banko saskaita galima sukurti tik ivedant numeri)
    public BankAccount(String number) {
        this.number = number;
    }

    //metodas debito paemimui is saskaitos (+ patikrinimas kad paimtume tik teigiama suma ir kad suma ne didesne uz balansa)
    public void debit(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
        } else {
            //throw new InsufficientBalanceException("Nepakankamas likutis");
        }
    }

    //metodas kredito idejmui i sakaita (+ patikrinimas kad idetume tik teigiama suma)
    public void credit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    //====== GET'eriai  SET'eriai =======================

    public double getBalance () {
        return this.balance;
    } //metodas kad "matytu" balansa (kuri perdarem i privatu) tekste

    public String getNumber() {
        return this.number;
    } //metodas kad "matytu" numeri (kuri perdarem i privatu) tekste
}
