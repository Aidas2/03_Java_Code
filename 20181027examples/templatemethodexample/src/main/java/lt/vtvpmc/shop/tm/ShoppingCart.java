package lt.vtvpmc.shop.tm;

import lt.vtvpmc.shop.strategy.Product;
import lt.vtvpmc.shop.strategy.VatStrategy;

import java.util.ArrayList;
import java.util.List;

public abstract class ShoppingCart {
    
    private List<Product> productList = new ArrayList<>();

    public ShoppingCart() { }

    public void add(lt.vtvpmc.shop.strategy.Product product) {
        this.productList.add(product);
    }

    public final double getTotalPrice() {
        double total = 0.0;

        for (Product product: productList) {
            total += product.getPrice();
        }

        return applyTaxes(total);
    }
    
    protected abstract double applyTaxes(double total);
}
