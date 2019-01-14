package lt.vtvpmc.ems.akademijait.aidas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P4ASCIITest {
    @Test
    void shouldReurnASCIICode() {
        assertEquals(112, P4ASCII.returnASCIIcode());
    }

}