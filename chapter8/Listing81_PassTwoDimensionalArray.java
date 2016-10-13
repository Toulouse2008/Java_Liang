/** Listing 8.1 Pass Two Dimensional Array  */

import java.util.Scanner;

public class Listing81_PassTwoDimensionalArray {
  public static void main(String[] args) {

    // Get an Array
    int[][] m = getArray();

    // Display sum of elements
    System.out.println("\nSum of all elements is " + sum(m));
  }

  /** Define the getArray method */
  public static int[][] getArray(){
    Scanner input= new Scanner(System.in);
    System.out.println("Enter the numbers of rows and columns:");
    int rows = input.nextInt();
    int cols = input.nextInt();
    int[][] m = new int[rows][cols];
    System.out.println("Enter " + rows + " rows and " + cols + " columns:");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        m[i][j] = input.nextInt();
      }
    }
    return m;
  }

  // Define the sum method
  public static int sum(int[][] m) {
    int total = 0;
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[0].length; j++) {
        total += m[i][j];
      }
    }
    return total;
  }

}
