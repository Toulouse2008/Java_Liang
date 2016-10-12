/** Exercise 7.10 Find the index of the smallest element
 *  Write a method that finds the index of the smallest element in an array of
 *  double values:
 *
 *  public static double indexOfSmallestElement(double[] array)
 */

import java.util.Scanner;

public class E710_FindIndexOfSmallest {
  public static void main(String[] args) {

    // Get the input form the user
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 10 floating point numbers: ");
    double[] array = new double[10];
    for (int i = 0; i < 10; i++) {
      array[i] = input.nextDouble();
    }

    System.out.println("The index of the smallest element is " +
                       indexOfSmallestElement(array));
  }

  // Define the indexOfSmallestElement method
  public static int indexOfSmallestElement(double[] array) {
    double smallest = array[0];
    int currentSmallestIndex = 0;
    for (int i = 1; i < array.length; i++) {
      if (smallest > array[i]) {
        smallest = array[i];
        currentSmallestIndex = i;
      }
    }
    return currentSmallestIndex;
  }
}
