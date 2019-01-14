package lt.vtvpmc.beer;

public class SvyturysBrewery implements Brewery {

    public int brewBeer(int waterInKg, int maltInKg, int hopsKg) {
        return Math.max(
                waterInKg,
                Math.max(maltInKg, hopsKg)
        ) * 2;
    }
    
}
