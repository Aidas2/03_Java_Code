package lt.vtvpmc.shop.tm;

public class ShoppingCartWithLithuanianVat extends ShoppingCart {
    
    @Override
    protected double applyTaxes(double total) {
        return total * 1.21;
    }
    
}
