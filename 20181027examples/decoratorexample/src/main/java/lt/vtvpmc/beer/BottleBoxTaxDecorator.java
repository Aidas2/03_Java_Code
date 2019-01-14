package lt.vtvpmc.beer;

public class BottleBoxTaxDecorator implements Brewery {
    
    private Brewery original;
    
    public BottleBoxTaxDecorator(Brewery brewery) {
        this.original = brewery;
    }
    
    public int brewBeer(int waterInKg, int maltInKg, int hopsKg) {
        return this.original.brewBeer(
                waterInKg, maltInKg, hopsKg
        ) - 1;
    }
}
