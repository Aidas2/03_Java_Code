package lt.vtvpmc.ems.akademijait.aidas;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringToCharTest {


    @Test
    void checkChar () {
        assertEquals('T', StringToChar.changeStringToCharacterArray("Tomas"));
    }

}