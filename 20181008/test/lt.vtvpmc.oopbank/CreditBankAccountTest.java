package lt.vtvpmc.oopbank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditBankAccountTest {

    @Test
    public void shouldHaveBankAccountNumber() {
        CreditBankAccount crediBankAccount = new CreditBankAccount("LT1");

        assertEquals("LT1", crediBankAccount.getNumber());
    }

    @Test
    public void shouldAllowDepositing() {
        CreditBankAccount creditBankAccount = new CreditBankAccount("");

        creditBankAccount.credit(100.0);

        assertEquals(100, creditBankAccount.getBalance(), 0.01);
    }

    @Test
    public void ShouldNotAllowCreditingNegativeAmount() {
        CreditBankAccount creditBankAccount = new CreditBankAccount("");

        creditBankAccount.credit(-10);

        assertEquals(0.0, creditBankAccount.getBalance(), 0.01);
    }

    @Test
    public void shouldAllowDebitingAnAccount() {
        CreditBankAccount creditBankAccount = new CreditBankAccount("");

        creditBankAccount.credit(10.0);
        creditBankAccount.debit(2.0);

        assertEquals(8, creditBankAccount.getBalance(), 0.01);
    }

    @Test
    public void shouldAllowSettingCreditLimit() {
        CreditBankAccount creditBankAccount = new CreditBankAccount(
                "",
                100);

        creditBankAccount.debit(60.0);

        assertEquals(-60, creditBankAccount.getBalance(), 0.01);
    }

    //testas pagal perrasyta (@Override) debit metoda, kuris ivertina ir kredito limita
    // hmm... turetu neleisti isimti visai (pagal if)
    // ir kodel expected yra 0, kas tai uzduoda ?
    @Test
    public void shouldAllowWithdrawlUpToCreditLimit() {
        CreditBankAccount creditBankAccount = new CreditBankAccount(
                "",
                100.0);

        creditBankAccount.debit(105.0);

        assertEquals(0.0, creditBankAccount.getBalance(), 0.01);
    }

    //======= INTERFEISAS (PATTERN) ========
    @Test
    public void shouldCalculateCreditWithInterestSilver() {
        CreditBankAccount creditBankAccount = new CreditBankAccount("LT3", 100, new InterestStrategySilver());

        creditBankAccount.debit(10);
        creditBankAccount.credit(20);

        assertEquals(9.5, creditBankAccount.getBalance(), 0.01);
    }

    @Test
    public void shouldCalculateCreditWithInterestGold() {
        CreditBankAccount creditBankAccount = new CreditBankAccount("LT4", 100, new InterestStrategyGold());

        creditBankAccount.debit(10);
        creditBankAccount.credit(20);

        assertEquals(9.8, creditBankAccount.getBalance(), 0.01);
    }

}





