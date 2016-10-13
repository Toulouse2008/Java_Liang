/** Exercise 8.2 Sum the major diagonal in a matrix
 *  Write a method that sums all the numbers in the major diagonal in an n x n
 *  matrix of double values using the following header:
 *  public static double sumMajorDiagonal(double[][] m)
 *  Write a test program that read 4 by 4 matrix and displays the sum of all its
 *  elements on the major diagonal.
 */

import java.util.Scanner;

public class E82_SumMajorDiagonal {
  public static void main(String[] args) {

    // Get the input from the user
    System.out.println("Enter the 4 x 4 matrix: ");
    Scanner input = new Scanner(System.in);
    double[][] matrix = new double[4][4];
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        matrix[i][j] = input.nextDouble();
      }
    }

    // Invoke the sumColumn method
    double sum = sumMajorDiagonal(matrix);

    // Output the result
    System.out.println("The sum of the diagonal is " + sum);
  }

  /** Define the sumMajorDiagonal method */
  public static double sumMajorDiagonal(double[][] m) {
    double total = 0;
    for (int i = 0; i < m.length; i++) {
      total += m[i][i];
    }
    return total;
  }
}
