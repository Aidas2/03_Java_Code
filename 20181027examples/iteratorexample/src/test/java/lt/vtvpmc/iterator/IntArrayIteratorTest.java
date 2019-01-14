package lt.vtvpmc.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntArrayIteratorTest {
    
    
    @Test
    public void shouldReturnAllNumberInIntArray() {
        IntArrayIterator intArrayIterator = new IntArrayIterator(
                new int[] { 1, 2, 3 }
        );
        
        assertTrue(intArrayIterator.hasNext());
        int first = intArrayIterator.next();
        assertEquals(1, first);
        
        assertTrue(intArrayIterator.hasNext());
        int second = intArrayIterator.next();
        assertEquals(2, second);
        
        assertTrue(intArrayIterator.hasNext());
        int third = intArrayIterator.next();
        assertEquals(3, third);
        
        assertFalse(intArrayIterator.hasNext());
    }
    
    @Test
    public void shouldIterateAllArrayElements() {
        IntIterator intArrayIterator = new IntArrayIterator(
                new int[] { 1, 2, 3 }
        );
        
        int sum = 0;
        
        while (intArrayIterator.hasNext()) {
            sum += intArrayIterator.next();
        }
        
        assertEquals(6, sum);
    }

}