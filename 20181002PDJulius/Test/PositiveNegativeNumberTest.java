import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PositiveNegativeNumberTest {

    @Test
    void checkIfNumberIsPosOrNeg(){

        int number = -5;
        assertEquals("negative",PositiveNegativeNumber.checkNumber(0));

    }

}