package lt.vtvpmc.shop.tm;

public class ShoppingCartWithNoVat extends ShoppingCart {
    @Override
    protected double applyTaxes(double total) {
        return total;
    }
}
