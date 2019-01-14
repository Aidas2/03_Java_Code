import lt.vtvpmc.ems.akademijait.jonas.BankAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    public void accountShouldHaveNumber(){
        //Sukuriame nauja objekto kintamaji
        BankAccount bankAccount = new BankAccount("LT1");
        //bankAccount.number = "LT123";
        //assertEquals("LT123", bankAccount.number);

     }

     @Test
     public void differentBankAccountsShouldHaveDifferentNumber(){
        BankAccount bankAccount1 = new BankAccount("LT1");
        BankAccount bankAccount2 = new BankAccount("LT2");

        //bankAccount1.number = "LT1";
        //bankAccount2.number = "LT2";

       assertEquals("LT1", bankAccount1.getNumber());
        assertEquals("LT2", bankAccount2.getNumber());
     }
    @Test
    public void accountShouldHaveABalance(){
        BankAccount bankAccount = new BankAccount("LT1");
        //bankAccount.balance = 1.0;
        //assertEquals(1.0, bankAccount.balance);
    }

    @Test
    public void accountShouldHaveABalance1(){
        BankAccount bankAccount = new BankAccount("LT1");
        bankAccount.credit(1.0);
        assertEquals(1.0, bankAccount.getBalance());
    }

    @Test
    public void accountBalanceShouldOnlybePositive(){
        BankAccount bankAccount = new BankAccount("LT1");
        bankAccount.credit(-1.0);
        //bankAccount.balance = -15;
        assertEquals(0.0, bankAccount.getBalance(), 0.01);
    }
}