package ashop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WineTest {
    
    @Test
    public void shouldCalculateTotalPriceWithTaxes() {
        Wine wine = new Wine("Lavel Blanc", 5.0, 1.0);
        
        assertEquals(6.65 * 1.21, wine.getTotalPrice());
    }
    
}
