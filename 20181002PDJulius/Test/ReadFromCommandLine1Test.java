import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReadFromCommandLine1Test {

    @Test
    void readFromCMD(){
        assertEquals("Hello",ReadFromCommandLine1.read());
    }

}