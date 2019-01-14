import java.util.Arrays;

public class MaxValue {
    public static int getMaxValue(int[] array) {
        Arrays.sort(array);
        return array[array.length-1];
    }
}
