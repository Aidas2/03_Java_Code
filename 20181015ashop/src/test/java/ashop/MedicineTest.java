package ashop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedicineTest {
    
    @Test
    public void shouldReturnTotalPriceWith5PVatApplied() {
        Medicine medicine = new Medicine("Test", 10.0);

        assertEquals(10.5, medicine.getTotalPrice());
    }
    
}
