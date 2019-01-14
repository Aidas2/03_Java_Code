package lt.vtvpmc.ems.akademijait.zwaclaw;

import java.util.Arrays;

public class HomeWork20181001 {
  public static void main(String[] args) {
    int n = 10, i, j;
    int matrix[][] = new int[n][n];
    for (i = 0; i < n; i++) {
      for (j = 0; j < n; j++) {
        if (i == j)
          matrix[i][j] = (int)(Math.random()*10);
        else
          matrix[i][j] = 1;
      }
    }
    for (i = 0; i < n; i++){
      for(j = 0; j < n; j++)
      {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }

    int sum = 0;
    for (i = 0; i < n; i++)
    {
      sum += matrix[i][i];
    }
    System.out.println("The sum of selected elements is " + sum + ".");
  }
}
