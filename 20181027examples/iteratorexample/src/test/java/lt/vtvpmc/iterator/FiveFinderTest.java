package lt.vtvpmc.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FiveFinderTest {
    
    
    @Test
    public void shouldFindFiveWhenOneExists() {
        IntArrayIterator intArrayIterator = new IntArrayIterator(
                new int[] { 2, 4, 5, 6, 7 }
        );
        
        FiveFinder fiveFinder = new FiveFinder();
        
        assertTrue(fiveFinder.hasFive(intArrayIterator));
    }
    
    @Test
    public void shouldNotFindFiveWhenOneDoesNotExist() {
        IntArrayIterator intArrayIterator = new IntArrayIterator(
                new int[] { 2, 4, 6, 7 }
        );

        FiveFinder fiveFinder = new FiveFinder();

        assertFalse(fiveFinder.hasFive(intArrayIterator));
    }
    
    @Test
    public void shouldFindASingleFive() {
        IntIterator intIterator = new SingleFiveIterator();
        
        FiveFinder fiveFinder = new FiveFinder();
        
        assertTrue(fiveFinder.hasFive(intIterator));
    }
    
    @Test
    public void shouldNotFindFiveInEvenNumbers() {
        IntIterator intIterator = new EvenNumberIterator();
        
        FiveFinder fiveFinder = new FiveFinder();
        
        assertFalse(fiveFinder.hasFive(intIterator));
    }
    
}
