import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryToStringTest {
    @Test
    void binaryToString(){
        String binaryString ="01000001 01000010 01000011 01000100";//ABCD

        assertEquals("ABCD",BinaryToString.convert(binaryString));

    }

}