public class PrimeNumber {
    public static int[] getPrimeNumber(int i) {


        int[] primeNumbers = new int[i];

        if (i == 1) {
            primeNumbers[0] = 2;
            return primeNumbers;
        } else if (i == 2) {
            primeNumbers[0] = 2;
            primeNumbers[1] = 3;
            return primeNumbers;
        } else if (i == 3) {
            primeNumbers[0] = 2;
            primeNumbers[1] = 3;
            primeNumbers[2] = 5;
            return primeNumbers;
        }

        primeNumbers[0] = 2;
        primeNumbers[1] = 3;
        primeNumbers[2] = 5;

        int primeIndex = 3;

        for (int j = 6; ; j++) {
            double sr = Math.sqrt(j);
            if ((j % 2 != 0) && (j % 3 != 0) && (j % 5 != 0) && (sr - Math.floor(sr) != 0)) {
                primeNumbers[primeIndex++] = j;
                if (primeIndex == i) {
                    return primeNumbers;
                }

            }
        }
    }
}
