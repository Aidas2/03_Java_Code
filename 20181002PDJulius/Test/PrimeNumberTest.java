import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrimeNumberTest {

    @Test
    void showPrimeNumber() {
        //2nd - 3
        //5th - 11
        int[] primeNumbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67};

        assertEquals(Arrays.toString(primeNumbers), Arrays.toString(PrimeNumber.getPrimeNumber(4)));
    }

}