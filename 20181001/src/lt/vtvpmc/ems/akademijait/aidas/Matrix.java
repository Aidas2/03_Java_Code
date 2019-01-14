package lt.vtvpmc.ems.akademijait.aidas;

import java.util.Arrays;

public class Matrix {

    private int [] [] matrix;   //cia yra masyvo deklaravimas

    /// cia yra metodas Matrix, skirtas matricos suformavimui
    public Matrix (int size) {
        matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }
    }
    /// cia yra metodas printMatrix, skirtas rezultato isvedimui
    public void printMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i])+"\n");
        }
    }
}
