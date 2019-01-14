package lt.vtvpmc.shop.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    @Test
    public void shouldCalculateTotalPriceOfProducts() {
        ShoppingCart shoppingCart = new ShoppingCart(
                new NoTaxVatStrategy()
        );
        
        shoppingCart.add(new Product(1.0));
        shoppingCart.add(new Product(2.0));
        
        assertEquals(3.0, shoppingCart.getTotalPrice());
    }
    
    @Test
    public void shouldCalculateTotalPriceWithLTTaxesApplied() {
        ShoppingCart shoppingCart = new ShoppingCart(
                new LithuanianVatStrategy()
        );

        shoppingCart.add(new Product(1.0));
        shoppingCart.add(new Product(2.0));

        assertEquals(3.63, shoppingCart.getTotalPrice());
    }
    
    
}