package lt.vtvpmc.ems.akademijait.aidas;

import java.math.BigInteger;

public class BigNumbers {
    public static BigInteger addTwoBigIntegerNumbers(BigInteger numberOne, BigInteger numberTwo) {
        System.out.println(numberOne);
        System.out.println(numberTwo);
        return numberOne.add(numberTwo);

    }

    public static BigInteger powerOfTwoBigIntegerNumbers(BigInteger numberOne, int numberTwo) {
        return numberOne.pow(numberTwo);
    }

}


