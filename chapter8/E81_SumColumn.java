/** Exercise 8.1 Sum elements column by column
 *  Write a method that returns the sum of all the elements in a specified
 *  column in a matrix using the following header:
 *  public static double sumColumn(double[][] m, int columnIndex)
 *  Write a test program that read 3 by 4 matrix and displays the sum of each
 *  column.
 */

import java.util.Scanner;

public class E81_SumColumn {
  public static void main(String[] args) {

    // Get the input from the user
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of rows and columns for the 3 by 4 matrix: ");
    int rows = input.nextInt();
    int cols = input.nextInt();
    double[][] matrix = new double[rows][cols];
    System.out.println("Enter the matrix: ");
    for (int i = 0; i < rows; i++){
      for(int j = 0; j < cols; j++) {
        matrix[i][j] = input.nextDouble();
      }
    }

    System.out.println("Enter the column to sum: ");
    int col = input.nextInt();

    // Invoke sumColumn
    double sum = sumColumn(matrix, col);
    System.out.printf("The sum of the %d column is %f.\n", col, sum);

  }

  /** Define sumColumn method */
  public static double sumColumn(double[][] m, int columnIndex) {
    double sum = 0;
    for (int i = 0; i < m.length; i++) {
      sum += m[i][columnIndex];
    }
    return sum;
  }

}
