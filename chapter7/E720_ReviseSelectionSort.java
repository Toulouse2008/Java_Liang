/** Exercise 7.20 Revise selection sort
 *  Rewrite the selection sort in section 7.11 to repeatedly find the
 *  largest number and swapping it with the last.
 *  Write a test program that reads 10 double numbers, invokes the method,
 *  display the sorted numbers.
 */

import java.util.Scanner;

public class E720_ReviseSelectionSort {
  public static void main(String[] args) {

    // Get the input from the user
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 10 floating point numbers: ");
    double[] array = new double[10];
    for (int i = 0; i < 10; i++) {
      array[i] = input.nextDouble();
    }

    // Invoke the selectionSort method
    array = selectionSort(array);

    // Output the result
    for (int i = 0; i < 10; i++) {
      System.out.print(array[i] + " ");
    }
  }

  // Define the selectionSort method
  public static double[] selectionSort(double[] list) {
    double temp = 0;
    double currentMax = 0;
    for (int i = list.length - 1; i >= 1; i--) {
      currentMax = list[i];
      for (int j = i -1; j>= 0; j--) {
        if (list[j] > currentMax) {
          temp = list[j];
          list[j] = list[i];
          list[i] = temp;
        }
      }
    }
    return list;
  }
}
