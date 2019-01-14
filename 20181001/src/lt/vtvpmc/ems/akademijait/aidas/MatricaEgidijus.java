package lt.vtvpmc.ems.akademijait.aidas;

public class MatricaEgidijus {
    public static void main(String[] args) {
        sukurkMatrica3();
        // isveskMatrica3();
        // susumuokMatrica3();
    }

    /// metodas matricos sukurimui
    public static void sukurkMatrica3() {
        int n = 10;
        int[][] manoMatrica = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    elementuSpausdinimas(1, n);
                    manoMatrica[i][j] = 1;
                } else {
                    elementuSpausdinimas(0, n);
                    manoMatrica[i][j] = 0;
                }
            }
        }
        System.out.println("Elementu suma yra " + matricosElementuSuma(n, manoMatrica));
    }

    public static void elementuSpausdinimas(int elementas, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(elementas + "  ");
            }
            System.out.println();
        }
    }

    public static int matricosElementuSuma(int n, int[][] manoMatrica) {
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += manoMatrica[i][i];
        }
        return suma;
    }
}