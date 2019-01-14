package lt.vtvpmc.ashop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    public void itemShouldHaveNameAndPrice() {
        Product kitiproduktai = new Product("Pomidoras", 0.69);
        assertEquals("Pomidoras", kitiproduktai.getName());
        assertEquals(0.69, kitiproduktai.getBasePrice());
    }

     @Test
     public void shouldReturnTotalPriceWith21PVatApplied() {
        Product kitiproduktai = new Product("Agurkas", 10);
        assertEquals(10.21, kitiproduktai.getTotalPrice());
        }
 }