import lt.vtvpmc.ems.akademijait.aidas.P1CommandLine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P1CommandLineTest {

    @Test
    void shouldReturnTextFromCommandLine() {
        assertEquals("patikrinimas", P1CommandLine.nuskaityk());
    }
}