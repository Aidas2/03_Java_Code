package lt.vtvpmc.ems.akademijait.aidas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChangersTest {

    @Test
    void twoNumbersChange () { assertEquals(20.0, Changers.changeTwoNumbers(10.0, 20.0));; }

    @Test
    void twoNumbersChangeVersionTwo () {
        assertEquals(20.0, Changers.changeTwoNumbersVersionTwo(10.0, 20.0));;
    }

    @Test
    void twoNumbersChangeVersionThree () {
        assertEquals(20, Changers.changeTwoNumbersVersionThree(10, 20));;
    }

}