import java.util.Arrays;

public class MinMax {
    public static double find(double[] x) {
        Arrays.sort(x);
        double avarage = (x[0] + x[x.length-1]) / 2.0;
        return avarage;
    }
}
