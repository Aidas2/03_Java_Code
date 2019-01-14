package lt.vtvpmc.ems.akademijait.aidas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P5OddEvenNumbersTest {
    @Test
    void shouldSayOddOrEven() {
        int skaicius1 = 5; // reikia sukurti cia, bet tik todel kad jis figuruoja returniname atsakyme;
        int skaicius2 = 4;
        assertEquals("Skaicius " + skaicius1 + " yra nelyginis.", P5OddEvenNumbers.decideOddOrEven(5));
        assertEquals("Skaicius " + skaicius2 + " yra lyginis.", P5OddEvenNumbers.decideOddOrEven(4));
    }

}