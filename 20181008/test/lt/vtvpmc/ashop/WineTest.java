package lt.vtvpmc.ashop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WineTest {

    @Test
    public void itemShouldHaveNameAndPriceAndVolume() {
        Wine vynelis = new Wine("Lavel Blanc", 5.0, 1.0);
        assertEquals("Lavel Blanc", vynelis.getName());
        assertEquals(5.0, vynelis.getBasePrice());
        assertEquals(1.0, vynelis.getVolume());
    }

    @Test
    public void shouldReturnTotalPriceWith21PVatAndVolumeApplied() {
        Wine vynelis = new Wine ("Voruta", 10.0, 1.0);
        assertEquals(14.1, vynelis.getTotalPrice(), 0.01);
    }
}