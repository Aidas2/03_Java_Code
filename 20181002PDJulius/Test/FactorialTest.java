import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorialTest {

    @Test

    void findFactorial(){

        //5!=5x4x3x2x1=120

        assertEquals(120,Factorial.findFactorial(20));

    }

}