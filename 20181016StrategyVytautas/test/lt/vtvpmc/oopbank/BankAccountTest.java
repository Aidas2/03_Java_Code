package lt.vtvpmc.oopbank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    public void accountShouldHaveNumber() {
        // Creates new instance of BankAccount
        BankAccount bankAccount = new BankAccount("LT123");
        
        assertEquals("LT123", bankAccount.getNumber());
    }

    @Test
    public void differentBankAccountsShouldHaveDifferentNumbers() {
        BankAccount bankAccount1 = new BankAccount("LT1");
        BankAccount bankAccount2 = new BankAccount("LT2");
        
        assertEquals("LT1", bankAccount1.getNumber());
        assertEquals("LT2", bankAccount2.getNumber());
    }

    @Test
    public void accountShouldHaveABalance() {
        BankAccount bankAccount = new BankAccount("");
        
        bankAccount.credit(1.0);
        
        assertEquals(1.0, bankAccount.getBalance(), 0.01);
    }

    @Test
    public void accountBalanceShouldOnlyBePositive() {
        BankAccount bankAccount = new BankAccount("");
        
        bankAccount.credit(-1.0);
        
        assertEquals(0.0, bankAccount.getBalance(), 0.01);
    }

}








