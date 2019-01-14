import java.util.Arrays;

public class Matrix {
    public static int findSum() {
        int[][] matrix = new int[10][10];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 0;


            }
            matrix[i][0] = i;
            matrix[i][1] = i * i;
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][0]);
                sum += (matrix[i][0] + matrix[i][1]);
        }
        return sum;
    }
}
