public class Factorial {
    public static long findFactorial(int i) {
        long fact = i;
        for (int j = i - 1; j > 1; j--) {
            fact *= j;
        }
        return fact;
    }
}
