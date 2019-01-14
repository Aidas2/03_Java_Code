import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringToBinaryTest {

    @Test
    void stringToBinary(){

        String str = "ABCD";//01000001 01000010 01000011

        assertEquals("010000001 01000010 01000011 01000100",StringToBinary.convert(str));

    }

}