import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ASCIICodeTest {

    @Test
    void showASCIICode(){
        //177 ±
        //230 æ
        //64 @
        assertEquals(64,ASCIICode.getASCIICode('@'));
        assertEquals(177,ASCIICode.getASCIICode('±'));
        assertEquals(230,ASCIICode.getASCIICode('æ'));
    }

}