package lt.vtvpmc.ems.akademijait.aidas;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class BigNumbersTest {

    @Test
    void returnBigIntegerNumber () {
        assertEquals(new BigInteger("100000000000000000000000000000000"), BigNumbers.addTwoBigIntegerNumbers(new BigInteger("100000000000000000000000000000000"), new BigInteger("0")));
    }

    @Test
    void returnPowerOfBigIntegerNumber() {
        assertEquals(new BigInteger("1800116818973009976332071408036678636685957839572920003209945109966397316"), BigNumbers.powerOfTwoBigIntegerNumbers(new BigInteger("1341684321654318943518435186435184354"), 2));
    }


}