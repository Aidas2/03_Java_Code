package lt.vtvpmc.ems.akademijait.aidas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P7ThreeNumbersTest {

    @Test
    void shouldReturnBiggestNumberOfArray() {
    //int [] masyvas = new int[]  {10, 15, 12}; //nereikia kurti, nes jau yra paciame metode jis
    assertEquals(15, P7ThreeNumbers.biggestFromArray());
    }

    @Test
    void shouldReturnBiggestFromIntegers() {
        assertEquals(155, P7ThreeNumbers.biggestFromIntegerrs());
    }

}