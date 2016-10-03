/** Exercise 3.1 Sovle quadratic equations
 *  Given a, b and c, use b * b - 4 * a * c to calculate to root if any"
 */

import java.util.Scanner;

public class SolveQuadraticEquation {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter a, b, and c:");
    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();
    double d = b * b - 4 * a * c;
    double r, r1, r2;

    if ( d < 0){
      System.out.println("The equation has no real roots.");
    }
    else if (d == 0){
      r = -b /(2 * a);
      System.out.println("The equation has one root and the root is " + r + ".");
    }
    else {
      r1 = (-b + Math.pow(d, 0.5)) / (2 * a);
      r2 = (-b - Math.pow(d, 0.5)) / (2 * a);
      System.out.println("r1 is " + r1 + "; r2 is " + r2 + ".");
    }
  }
}
