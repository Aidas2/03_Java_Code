package lt.vtvpmc.acart;

public class NoDiscountStrategy implements DiscountStrategy{

    public double applyDiscount(double totalPrice) {
        return totalPrice;
    }
}
