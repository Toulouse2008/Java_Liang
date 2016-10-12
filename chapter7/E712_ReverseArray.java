/** Exercise 7.12 Reverse an array
 *  Write a method that reverses the array passed in the argument and
 *  returns this array. Write a test program that prompt the user to
 *  10 numbers, and displays the reversed numbers.
 */

import java.util.Scanner;

public class E712_ReverseArray {
  public static void main(String[] args) {

    // Get teh input from the user
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 10 floating point numbers: ");
    double[] array = new double[10];
    for (int i = 0; i < 10; i++) {
      array[i] = input.nextDouble();
    }

    // Invoke the revereArray method
    reverseArray(array);

    // Output the result
    for (int i = 0; i < 10; i++) {
      System.out.print(array[i] + " ");
    }

    // Extra line
    System.out.println();
  }

  // Define the reverseArray method
  public static void reverseArray(double[] x) {
    double temp = 0;
    for (int i = 0; i < x.length / 2; i++) {
      temp = x[i];
      x[i] = x[x.length - 1 - i];
      x[x.length - 1 - i] = temp;
    }
  }

}
