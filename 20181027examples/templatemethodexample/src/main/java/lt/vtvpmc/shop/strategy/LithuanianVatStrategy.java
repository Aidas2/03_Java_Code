package lt.vtvpmc.shop.strategy;

public class LithuanianVatStrategy implements VatStrategy {
    @Override
    public double apply(double total) {
        return total * 1.21;
    }
}
