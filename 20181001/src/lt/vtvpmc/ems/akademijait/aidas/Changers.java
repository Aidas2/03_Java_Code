package lt.vtvpmc.ems.akademijait.aidas;

import java.sql.SQLOutput;

public class Changers {
    public static void main(String[] args) {
    changeTwoNumbers(10, 20);
    //changeTwoNumbersVersionTwo(10.0, 20.0);
    //changeTwoNumbersVersionThree(10, 20);
    //printBinaryDouble(10.5);
    }

    // Pirmas budas: pilstom is vieno indo i kita :)
    public static double changeTwoNumbers(double numberOne, double numberTwo) {
        double tmp = numberOne;
        numberOne = numberTwo;
        numberTwo = tmp;
        return numberOne;
        //System.out.println(numberOne + numberTwo);
    }

    //Antras budas: suma/atimtis
    public static double changeTwoNumbersVersionTwo(double numberOne, double numberTwo) {
        numberOne = numberOne + numberTwo;
        numberTwo = numberOne - numberTwo;
        numberOne = numberOne - numberTwo;
        return numberOne;
    }

    //Trecias budas: xorg'as
    public static int changeTwoNumbersVersionThree(int numberOne, int numberTwo) {
        numberOne = numberOne ^ numberTwo;
        numberTwo = numberOne ^ numberTwo;
        numberOne = numberOne ^ numberTwo;
        return numberOne;
    }

    public static void printBinaryDouble(double number) {
        long bits = Double.doubleToLongBits(number);
        for (int i = 63; i >= 0; --i) {                     //veliau perdare i 31 - kodel ?
            System.out.print((bits & (1 << i)) == 0 ? "0" : "1");
        }
    }
}
