package ashop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {
    
    
    @Test
    public void shouldHaveNameAndPrice() {
        Item item = new Product("Test", 10.0);

        assertEquals("Test", item.getName());
        assertEquals(10.0, item.getBasePrice());
    }
    
    @Test
    public void shouldReturnItsFinalPriceWithVat() {
        Item item = new Product("Test", 10.0);

        assertEquals(12.1, item.getTotalPrice());
    }
    
    
}
