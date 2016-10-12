/** Exercise 7.11 Statistics: compute deviation
 */

import java.util.Scanner;

public class E711_ComputeDeviation {
  public static void main(String[] args) {

    // Get the input from the user
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 10 floating point numbers: ");
    double[] array = new double[10];
    for (int i = 0; i < 10; i++) {
      array[i] = input.nextDouble();
    }
    double average = mean(array);
    double standardDeviation = deviation(array);
    System.out.printf("The mean is %3.2f\n", average);
    System.out.printf("The deviation is %6.5f\n", standardDeviation);
  }

  // Define the method mean
  public static double mean(double[] x) {
    double mean = 0;
    double sum = 0;
    for (int i = 0; i < x.length; i++) {
      sum += x[i];
    }
    mean = sum / x.length;
    return mean;
  }

  // Define the deviation method
  public static double deviation(double[] x) {
    double sum = 0;
    double average = mean(x);
    for (int i = 0; i < x.length; i++) {
      sum += Math.pow((x[i] - average), 2);
    }
    double deviation = Math.pow(sum / (x.length - 1), 0.5);
    return deviation;
  }
}
