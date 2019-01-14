package lt.vtvpmc.shop.strategy;

public class NoTaxVatStrategy implements VatStrategy {
    @Override
    public double apply(double total) {
        return total;
    }
}
