package lt.vtvpmc.ems.akademijait.aidas;


import java.util.Arrays;

// 17. Programa generuojanti pateiktą matricą ir skaičiuojanti pirmo ir antro stulpelio sumas.
public class P17Matrica {
    public static void main (String [] args){
        CreateMatrix();
        //SumFirstToColums(manoMatrica); //nemato, kodel ?
    }

    public static void CreateMatrix() {
        int n = 10;
        int[][] manoMatrica = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                manoMatrica[i][j] = 0;
            }
            manoMatrica[i][0] = i;
            manoMatrica[i][1] = i * i;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(manoMatrica[i][j] + "  ");
            }
            System.out.println();
        }
        //arba
        System.out.println(" ---- arba --- ");
        for (int i = 0; i < manoMatrica.length; i++) {
            System.out.println(Arrays.toString(manoMatrica[i]));
        }

        //sumavimas iskvietus metoda:
        SumFirstToColums(manoMatrica);
    }

    public static void  SumFirstToColums (int[][] manoMatrica) {
        int sum = 0;
        for (int i = 0; i < manoMatrica.length; i++) {
            sum += (manoMatrica[i][0] + manoMatrica[i][1]);
        }
        System.out.println("SumFirstToColums: " + sum);
    }
}