/** Exercise 8.5 Algebra: add two matrices
 *  Write a method to add two matrices.
 *  Header:  public static double[][] addMatrix(double[][] a, double[][] b)
 *  In order to be added, the two matrices must have the same dimensions and the
 *  same or compatible type of elements. Let c be the resulting matrix.
 *  Write a test program that prompts the user to enter two 3 x 3 matrices and
 *  displays their sum.
 */

 import java.util.Scanner;

 public class E85_AddMatrix {
   public static void main(String[] args) {
     Scanner input= new Scanner(System.in);
     System.out.println("Enter the numbers of rows and columns:");
     int rows = input.nextInt();
     int cols = input.nextInt();
     double [][] a = new double[rows][cols];
     double [][] b = new double[rows][cols];
     System.out.println("Enter " + rows + " rows and " + cols + " columns for a:");
     for (int i = 0; i < rows; i++) {
       for (int j = 0; j < cols; j++) {
         a[i][j] = input.nextDouble();
       }
     }
     System.out.println("Enter " + rows + " rows and " + cols + " columns for b:");
     for (int i = 0; i < rows; i++) {
       for (int j = 0; j < cols; j++) {
         b[i][j] = input.nextDouble();
       }
     }

     // Invoke the addMatrix method
     double[][] c = addMatrix(a, b);
     for (int i = 0; i < rows; i++) {
       for (int j = 0; j < cols; j++) {
         System.out.printf("%3.2f ", c[i][j]);
       }
       System.out.println();
     }
     System.out.println();
   }

   /** Define the addMatrix method */
   public static double[][] addMatrix(double[][] a, double[][] b) {
     if (a.length != b.length || a[0].length != b[0].length) {
       System.out.println("Invalid inputs");
       System.exit(1);
     }
     double[][] results = new double[a.length][a[0].length];
     for (int i = 0; i < a.length; i++) {
       for (int j = 0; j < a[0].length; j++) {
         results[i][j] = a[i][j] + b[i][j];
       }
     }
     return results;
   }
 }
