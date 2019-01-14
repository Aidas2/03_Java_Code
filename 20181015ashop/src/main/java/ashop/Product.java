package ashop;

public class Product extends Item {
    public Product(String name, double basePrice) {
        super(name, basePrice);
    }

    public double getTotalPrice() {
        return this.getBasePrice() * 1.21;
    }
}
