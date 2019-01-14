package lt.vtvpmc.ems.akademijait.aidas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P18ThreeDigitsTest {
    @Test
    void returnSumOfThreeDigist () {
        assertEquals(15, P18ThreeDigits.SumOfDigits(456));
    }
}