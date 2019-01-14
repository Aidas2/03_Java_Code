import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RandomNumbersTest {

    @Test
    @DisplayName("This is my test")
    @Tag("It is my tag")
    void getRandomNumber(){
        long seed = 5;
        Random rnd = new Random(seed);
        int randomNumber = rnd.nextInt();
        assertEquals(randomNumber, RandomNumbers.generate(seed),"Shuld be something");
    }
}