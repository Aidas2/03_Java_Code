import lt.itakademija.exam.*;

import java.util.ArrayList;
import java.util.List;

public class BankImpl implements Bank {

    private final CurrencyConverter currencyConverter; //deklaruojam valiutos keitykla
    private final List<Customer> customers; //deklaruojam lista kad butu kur deti vartotojus, sukuriamus pagal metoda 'createCustomer'

    //trys generatoriai eiliskumui-unikalumui:
    private SequenceGenerator customerSequence = new SequenceGenerator(); //sukuriam generatoriu kad vartotojas turetu eiliskuma
    private SequenceGenerator accountSequence = new SequenceGenerator(); //sukuriam generatoriu saskaitai kita valiuta
    private SequenceGenerator operationSequence = new SequenceGenerator(); //sukuriam generatoriu operaciju eiliskumui


    public BankImpl(CurrencyConverter currencyConverter) { //'Generate --> Construktor'
    this.currencyConverter = currencyConverter;
    this.customers = new ArrayList<>(); //rankom (buvo this.customers = customers)
    }

    @Override // visi override generuojami, o paskui koreguojami rankomis
    public Customer createCustomer(PersonCode personCode, PersonName personName) {
        if (personCode == null || personName == null) { //cia tik patikrinimas ar vartotojas turi duomenis (koda ir varda)
            throw new NullPointerException();
        }

        for (Customer customer : customers) { //cia tik patikrinimas ar vartotojas nesikartoja (ar toks jau yra ar nera)
            if (customer.getPersonCode().equals(personCode)) {  //tikrinam pagal koda (nes jis unikalus)
                throw new CustomerCreateException("Customer already exist");
            }
        }

        Customer customer = new Customer (customerSequence.getNext(), personCode, personName); //sukuriam vartotoja + eiliskumas
        customers.add(customer); //pridedam vartotoja i lista
        return customer;
    }

    @Override
    public Account createAccount(Customer customer, Currency currency) {
        if (customer == null || currency == null) { //patikrinimas ar saskaita turi duomenis (vartotoja ir valiuta)
            throw  new NullPointerException();
        }

        if (!customers.contains(customer) ) { //patikrinimas ar vartotojas jau turi saskaita kokia nors kita valiuta (pvz. EUR)
            throw new AccountCreateException("Customer does not exits ... ");
        }

        Account account = new Account(accountSequence.getNext(), customer, currency, new Money(0.0d));
        customer.addAccount(account); //pridedam saskaita vartotojui
        return account;
    }

    @Override
    public Operation transferMoney(Account debitAccount, Account creditAcount, Money debitAmount) {
        if (debitAccount.getBalance().isLessThan(debitAmount)) { //palyginam ar saskaita nera mazesne uz paimama suma ("isLessThan' yra is jar failo)
            throw new InsufficientFundsException("You are bad customer ... ");
        }

        debitAccount.setBalance(debitAccount.getBalance().substract(debitAmount)); //is saskaitos atimam paimamsuma (substract reiskia atimti)
        //negalim tiesiog prideti debitAmount, nes gali buti operacija tarp skirtingu valiutu, todel pradzioj reikia konvertuoti:
        Money creditAmount = currencyConverter.convert(debitAccount.getCurrency(), creditAcount.getCurrency(), debitAmount );
        creditAcount.setBalance(creditAcount.getBalance().add(creditAmount));
        return new Operation(operationSequence.getNext(), debitAccount, creditAcount, debitAmount);
    }

    @Override
    public Money getBalance(Currency currency) {
        Money balance = new Money (0.0d); //sukuriam balansa su nuliu valiutos

        //kadangi reikia balanso ir visu saskaitu ir tik eurais, tai iteruojam per visus vartotojus ir iteruojam per visas vartotojo saskaitas:
        //jei visu saskaitu valiuta Eur, tai pridedam iskart, jei ne - tai pirma konvertuojam ir tada pridedam
        for(Customer customer : customers) {
            for (Account account : customer.getAccounts()) {
                if (account.getCurrency().equals(currency)) {
                    balance = balance.add(account.getBalance());
                } else {
                    balance = balance.add(currencyConverter.convert(account.getCurrency(), currency, account.getBalance()));
                }
            }
        }
        return balance;
    }
}
