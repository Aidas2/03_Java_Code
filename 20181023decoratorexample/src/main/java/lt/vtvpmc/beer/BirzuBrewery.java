package lt.vtvpmc.beer;

public class BirzuBrewery implements Brewery {

    public int brewBeer(int waterInKg, int maltInKg, int hopsKg) {
        return Math.min(
                waterInKg, 
                Math.min(maltInKg, hopsKg)
        ) * 2;
        
    }
    
}
