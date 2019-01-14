package lt.vtvpmc.beer;

public class CubanBreweryDecorator implements Brewery {
    
    private Brewery original;
    
    public CubanBreweryDecorator(Brewery brewery) {
        this.original = brewery;
    }

    @Override
    public int brewBeer(int waterInKg, int maltInKg, int hopsKg) {
        int maltTax = Math.max(1, maltInKg / 10);
        return original.brewBeer(waterInKg, maltInKg - maltTax, hopsKg);
    }
}
