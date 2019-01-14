import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringToCharTest {

    @Test
    void stringToChar(){
        char ch = '5';
        String str = "5";
        assertEquals(ch,StringToChar.stringToChar(str));
    }

    @Test
    void charToString(){
        char ch = 'H';
        String str = "H";
        assertEquals(str,StringToChar.charToString(ch));
    }

}