/** Exercise 7.8 Average an array
 *  Write two overloaded methods that return the average of an array with the
 *  following headers:
 *  public static int average(int[] array)
 *  public static double average(double[] array)
 *  Write a test program that prompts the user to enter ten double values,
 *  invokes this methods and displays the average value.
 */

import java.util.Scanner;

public class E78_AverageArray {
  public static void main(String[] args) {

    // Get the inputs from the user
    double[] array = new double[10];
    Scanner input = new Scanner(System.in);
    for (int i = 0; i < 10; i++) {
      array[i] = input.nextDouble();
    }
    System.out.println("The average of the array is " + average(array));
  }

  // Define the method of average
  public static int average(int[] array) {
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }
    int average = sum / array.length;
    return average;
  }

  public static double average(double[] array) {
    double sum = 0;
    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }
    double average = sum / array.length;
    return average;
  }
}
