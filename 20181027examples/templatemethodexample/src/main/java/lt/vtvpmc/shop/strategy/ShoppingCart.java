package lt.vtvpmc.shop.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    
    private VatStrategy vatStrategy;
    
    private List<Product> productList = new ArrayList<>();
    
    public ShoppingCart(VatStrategy vatStrategy) {
        this.vatStrategy = vatStrategy;
    }
    
    public void add(Product product) {
        this.productList.add(product);
    }
    
    public double getTotalPrice() {
        double total = 0.0;
        
        for (Product product: productList) {
            total += product.getPrice();
        }
        
        return vatStrategy.apply(total);
    }
    
}
