public class SumOfNumber {
    public static long countSum(int from, int to) {
        int sum = ((int) Math.pow(to, 2) + to) / 2 - ((int) Math.pow(from, 2) - from) / 2;
        return sum;
    }
}
