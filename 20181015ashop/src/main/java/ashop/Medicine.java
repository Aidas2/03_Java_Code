package ashop;

public class Medicine extends Item {
    public Medicine(String name, double basePrice) {
        super(name, basePrice);
    }

    @Override
    public double getTotalPrice() {
        return getBasePrice() * 1.05;
    }
}
