package lt.vtvpmc.ems.akademijait.aidas;

public class Matrica {
    public static void main(String[] args) {
        sukurkMatrica3();
    }

    /// metodas matricos sukurimui
    public static void sukurkMatrica3() {
        int n = 10;
        int[][] manoMatrica = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    manoMatrica[i][j] = 1;
                } else {
                    manoMatrica[i][j] = 0;
                }
            }
        }
        isveskMatrica3(n, manoMatrica);
        System.out.println("Matricos istrizaines suma " + susumuokMatrica3(n, manoMatrica));
    }

    // cia turetu buti atskiras metodas matricos isvedimui i ekrana
    public static void isveskMatrica3(int n, int[][] manoMatrica) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(manoMatrica[i][j] + "  ");
            }
            System.out.println();
        }
    }

    // cia turetu buti atskiras metodas matricos istrizaines susumavimui
    public static int susumuokMatrica3 (int n, int[][] manoMatrica) {
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += manoMatrica[i][i];
        }
        return suma;

    }
}