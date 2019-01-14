package lt.vtvpmc.ems.akademijait.aidas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P2RandomNumbersTest {

    @Test
    void shouldReturnRandomRumber() {
        assertEquals(10, P2RandomNumbers.generuokAtsitiktiniSkaiciu());
    }


}