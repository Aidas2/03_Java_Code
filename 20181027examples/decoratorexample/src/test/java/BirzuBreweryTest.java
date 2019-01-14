import lt.vtvpmc.beer.BirzuBrewery;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BirzuBreweryTest {

    @Test
    public void shouldBrewCorrectAmountOfBeer() {
        BirzuBrewery birzuBrewery = new BirzuBrewery();
        
        int beerBottles = birzuBrewery.brewBeer(
                4, 4, 4
        );
        
        assertEquals(8, beerBottles);
    }

}
