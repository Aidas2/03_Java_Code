package lt.vtvpmc.shop.tm;

import lt.vtvpmc.shop.strategy.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {
    
    @Test
    public void shouldCalculateTotalPrice() {
        ShoppingCartWithNoVat shoppingCartWithNoVat = new ShoppingCartWithNoVat();
        
        shoppingCartWithNoVat.add(new Product(1.0));
        shoppingCartWithNoVat.add(new Product(2.0));
        
        assertEquals(3.0, shoppingCartWithNoVat.getTotalPrice());
    }
    
    @Test
    public void shouldCalculateTotalWithLTTaxesApplied() {
        ShoppingCartWithLithuanianVat shoppingCartWithLithuanianVat = 
                new ShoppingCartWithLithuanianVat();
        
        shoppingCartWithLithuanianVat.add(new Product(1.0));
        shoppingCartWithLithuanianVat.add(new Product(2.0));
        
        assertEquals(3.63, shoppingCartWithLithuanianVat.getTotalPrice());
    }

}