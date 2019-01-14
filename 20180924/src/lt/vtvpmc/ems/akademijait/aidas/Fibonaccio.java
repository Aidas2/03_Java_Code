package lt.vtvpmc.ems.akademijait.aidas;

public class Fibonaccio {
    public static void main (String[] args) {
        long startTime = System.currentTimeMillis();
        //fibo(10);
        System.out.println(fibo(10));
        long endTime = System.currentTimeMillis();
        System.out.println("Fibonaccio vykdymo trukme " + (endTime - startTime));

    }

    //BigInteger
    public static int fibo (int n) {
        if (n <2) {
            return n;
        }
        return fibo (n-1) + fibo(n-2);
    }
}
