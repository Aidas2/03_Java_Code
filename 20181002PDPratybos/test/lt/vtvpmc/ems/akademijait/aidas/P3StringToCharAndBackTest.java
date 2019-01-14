package lt.vtvpmc.ems.akademijait.aidas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P3StringToCharAndBackTest {

    @Test
    void iveskZodi() {
        assertEquals("labas", P3StringToCharAndBack.iveskZodi());
    }

    @Test
    void returnFirstLetter() {
        assertEquals('l', P3StringToCharAndBack.returnFirstLetter("labas"));
    }

    @Test
    void stringToCharArray() {
        assertEquals(new char[]{'l', 'a', 'b', 'a', 's'}, P3StringToCharAndBack.stringToCharArray("labas"));
    }

    @Test
    void charArrayToString() {
        //assertEquals("labas", P3StringToCharAndBack.charArrayToString(char [] {'l', 'a', 'b', 'a', 's'}));
    }
}