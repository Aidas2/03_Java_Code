package lt.vtvpmc.ems.akademijait.aidas;

import java.lang.reflect.Array;
import java.util.Arrays;

// 16. Programa ieškanti n-min, n-max ir aritmetinį vidurkį masyvo:
//double[] x = {1.35, 2.45, 2.05, 1.20, 2.15, 1.70, 1.45, 1.95, 2.00, 1.65, 1.65, 2.05, 1.75, 1.25, 2.25, 1.40};
public class P16MinMaxAverage {
    public static void main(String [] args) {
        double[] x = {1.35, 2.45, 2.05, 1.20, 2.15, 1.70, 1.45, 1.95, 2.00, 1.65, 1.65, 2.05, 1.75, 1.25, 2.25, 1.40};
        MinMax(x);
        Average(x);
    }

    public static void MinMax (double[] x) {

        Arrays.sort(x);
        System.out.println(Arrays.toString(x));
        System.out.println("Minimal Value: " + x[0]);
        System.out.println("Maximum Value:" + x[x.length-1]);
    }

    public static void Average (double[] x) {
        double suma = 0;
        System.out.println("Array length: " + x.length);
        for (int i = 0; i < x.length; i++) {
            suma += x[i];
        }
        System.out.println("Array sum: " + suma);
        double average = suma / x.length;
        System.out.println("Array average: " + average);
    }
}
