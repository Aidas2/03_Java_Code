import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringToHexadecimalTest {
    @Test
    void stringToHexadecimal(){

        String str = "abcd";// 61 62 63 64

        assertEquals("454545 45454 454",StringToHexadecimal.convert(str));

    }

}