package lt.vtvpmc.ashop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PressTest {

    @Test
    public void itemShouldHaveNameAndPrice() {
        Press spauda = new Press("Lietuvos rytas", 3.48);
        assertEquals("Lietuvos rytas", spauda.getName());
        assertEquals(3.48, spauda.getBasePrice());
    }

    @Test
    public void shouldReturnTotalpriceWith9PVatApplied() {
        Press spauda = new Press("Vakarines naujienos", 10);
        assertEquals(10.9, spauda.getTotalPrice());
    }

}