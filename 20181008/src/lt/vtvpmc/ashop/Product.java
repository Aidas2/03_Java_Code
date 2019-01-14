package lt.vtvpmc.ashop;

import lt.vtvpmc.ashop.Item;

public class Product extends Item {

    public Product(String name, double basePrice) {
        super(name, basePrice);
    }

    @Override
    public double getTotalPrice() {
        return this.getBasePrice() * 1.21;
    }
}
