package lt.vtvpmc.iterator2;

import lt.vtvpmc.iterator.IntArrayIterator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EightFinderTest {


    @Test
    public void shouldFindEigthWhenOneExists () {
        IntArrayIterator2 intArrayIterator2 = new IntArrayIterator2( new int[] { 2, 4, 5, 6, 7, 8 });

        EightFinder eightFinder = new EightFinder();

        assertTrue(eightFinder.hasEight(intArrayIterator2));
    }

    @Test
    public void shouldNotFindEightWhenOneDoesNotExist () {
        IntArrayIterator2 intArrayIterator2 = new IntArrayIterator2(new int[] { 2, 4, 5, 6, 7, 9 });

        EightFinder eightFinder = new EightFinder();

        assertFalse(eightFinder.hasEight(intArrayIterator2));
    }
}
