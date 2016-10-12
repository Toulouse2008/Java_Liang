/** Exercise 7.18 Bubble search  */

import java.util.Scanner;

public class E725_QuadraticEquations {
  public static void main(String[] args) {

    // Get the input from the user
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a, b, and c for the equation: ");
    double[] array = new double[3];
    for (int i = 0; i < 3; i++) {
      array[i] = input.nextDouble();
    }

    // Invoke the solveQuadratic method
    double[] results = new double[3];
    results = solveQuadratic(array);

    if (results[0] == 0)
      System.out.println("The number of real roots is " + (int)results[0]);
    else if (results[0] == 1) {
      System.out.println("The number of real roots is " + (int)results[0]);
      System.out.printf("The real root is: %5.3f.\n",
           results[1]);
    }
    else {
      System.out.println("The number of real roots is " + (int)results[0]);
      System.out.printf("The real roots are: %5.3f and %5.3f.\n",
           results[1], results[2]);
    }
  }

  // Define the solveQuadratic method
  public static double[] solveQuadratic(double[] eqn) {
    double standard = eqn[1] * eqn[1] - 4 * eqn[0] * eqn[2];
    double[] roots = new double[3];

    // Determine the number of roots and store the data in roots[0]
    if (standard < 0)
      roots[0] = 0;
    else if (standard == 0) {
      roots[0] = 1;
      roots[1] = -eqn[1] / (2 * eqn[0]);
    }
    else {
      roots[0] = 2;
      roots[1] = (-eqn[1] + Math.pow(standard, 0.5)) / (2 * eqn[0]);
      roots[2] = (-eqn[1] - Math.pow(standard, 0.5)) / (2 * eqn[0]);
    }
    return roots;
  }


}
