import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringToOctalTest {
    @Test
    void stringToOcatal(){
        String str = "World's simplest text to oct converter";
        assertEquals("127 157 162 154 144 47 163 40 163 151 155 160 154 145 163 164 40 164 145 170 164 40 164 157 40 157 143 164 40 143 157 156 166 145 162 164 145 162",StringToOctal.convert(str));
    }

}