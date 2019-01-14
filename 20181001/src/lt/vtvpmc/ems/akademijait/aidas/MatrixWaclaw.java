package lt.vtvpmc.ems.akademijait.aidas;

import java.util.Arrays;

public class MatrixWaclaw {
  public static void main(String[] args) {
    int n = 10, i, j;
    int matrix[][] = new int[n][n];   //cia yra matricos inicijavimas
    for (i = 0; i < n; i++) {         // cia yra matricos uzpildymas
      for (j = 0; j < n; j++) {
        if (i == j)
          matrix[i][j] = 1;   //sutampa eilutes ir stulpelio indeksai;
          //matrix[i][j] = (int)(Math.random()*10);  //linksmiau :)
        else
          matrix[i][j] = 0;
      }
    }

    for (i = 0; i < n; i++){    //cia yra matricos isvedimas
      for(j = 0; j < n; j++)
      {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }

    int sum = 0;              //cia yra sumavimas vienetuku istrizaineje
    for (i = 0; i < n; i++)
    {
      sum += matrix[i][i];
    }
    System.out.println("The sum of selected elements is " + sum + ".");
  }
}
