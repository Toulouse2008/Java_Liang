/** Exercise 7.9 Find the smallest element
 *  Write a method that finds the smallest element in an array of double
 *  values:
 *  public static double min(double[] array)
 */

import java.util.Scanner;

public class E79_FindSmallest {
  public static void main(String[] args) {

    // Get the input form the user
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 10 floating point numbers: ");
    double[] array = new double[10];
    for (int i = 0; i < 10; i++) {
      array[i] = input.nextDouble();
    }

    System.out.println("The smallest is " + min(array));
  }

  // Define the min method
  public static double min(double[] array) {
    double smallest = array[0];
    for (int i = 1; i < array.length; i++) {
      if (smallest > array[i]) {
        smallest = array[i];
      }
    }
    return smallest;
  }
}
