package lt.vtvpmc.ashop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedicineTest {

    @Test
    public void itemShouldHaveNameAndPrice() {
        Medicine medicine = new Medicine("Analginas", 60.5);
        assertEquals("Analginas", medicine.getName());
        assertEquals(60.5, medicine.getBasePrice());

    }

    @Test
    public void shouldReturnTotalpriceWith5PVatApplied() {
        Medicine medicine = new Medicine("Nospa",10.0);
        assertEquals(10.5, medicine.getTotalPrice(), 0.01);
    }
}