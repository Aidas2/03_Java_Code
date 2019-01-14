import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EvenOddNumbersTest {

    @Test
    void evenOddNumbers() {
        assertEquals(true, EvenOddNumbers.isNumberEvenOdd(6));
        assertEquals(false, EvenOddNumbers.isNumberEvenOdd(3));
    }

}