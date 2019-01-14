package lt.vtvpmc.ems.akademijait.aidas;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class P6PrimalNumbersTest {

    @Test
    void shouldReturnCountOfPrimalNumbers() {
        assertEquals(10, P6PrimalNumbers.suskaiciuokPirminius(10) );
    }

    @Test
    void shouldReturnArrayOfPrimalNumbers() {
        int [] pirminiaiNumeriai = new int[] {1, 11, 13, 17, 19, 23, 29, 31, 37, 41};
        assertEquals(Arrays.toString(pirminiaiNumeriai), Arrays.toString(P6PrimalNumbers.uzpildykPirminiais(10)));
    }

}