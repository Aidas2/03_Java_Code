package lt.vtvpmc.ashop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NegativePriceExceptionTest {

    //sitas failas ir testas nafig nereikalingas, toks turetu buti arba prie Item arba prie ShoppingCartTest
    @Test
    public void shouldThrowExceptionIfNegative() {
        try {
            Wine vynas = new Wine ("Saltmetys", -8.0, 1.0);
            fail();
        } catch (NegativePriceException ex) {
            System.out.println(ex.getMessage());
        }
    }

}