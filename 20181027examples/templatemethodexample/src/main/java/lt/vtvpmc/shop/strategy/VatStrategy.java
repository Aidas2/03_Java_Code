package lt.vtvpmc.shop.strategy;

public interface VatStrategy {

    /**
     * 
     * @param total
     * @return total with taxes applied
     */
    double apply(double total);
    
}
