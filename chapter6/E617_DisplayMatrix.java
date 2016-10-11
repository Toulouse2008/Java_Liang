/** Exercise 6.17 Display matrix of 0s and 1s
 *  Write a method that displays an n by n matrix using the following header:
 *  public static void printMatrix(int n)
 */

import java.util.Scanner;

public class E617_DisplayMatrix {
  public static void main(String[] args) {

    // Get the input from the user
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the dimension of the matrix: ");
    int n = input.nextInt();

    // Invoke printMatrix(n)
    printMatrix(n);

    }

  /** Define printMatrix  */
  public static void printMatrix(int n) {
    
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print((int)(2 * Math.random()) + " ");
      }
      System.out.println();
    }
  }

}
