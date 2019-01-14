package lt.vtvpmc.ems.akademijait.aidas;

public class Fibo {
    public static void main(String[] args) {
        findFibonacciNumber(121);

         }

    public static void findFibonacciNumber(int search) {
        int arraySize = search + 1;
        double[] array = new double[arraySize];
        array[0] = 0;
        array[1] = 1;
        int i = 2;

        while (i <= search) {
            array[i] = array[i - 1] + array[i - 2];
            System.out.println("Fibonacci of number " + i + " is " + array[i]);
            i++;
        }
        System.out.println("-----------------");
        System.out.println("Fibonacci of number " + search + " is " + array[search]);

    }


}
