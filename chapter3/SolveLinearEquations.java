/** Exercise 3.3 Solve 2 x 2 linear equations. Prompts the user to
 *  enter a, b, c, d, e, and f, display the result. If ad - bc = 0,
 *  report that "The equation has no solution."
 *  Cramer's rule: ax + by = c, dx + ey = f
 *  x = (ed - fb)/(ae - bd), y = (af - dc)/(ae - bd)
 */
import java.util.Scanner;

public class SolveLinearEquations {
  public static void main(String[] args){

    System.out.println("Enter a, b, c, d, e, and f for equations " +
           "ax + by =c and dx + ey = f:");

    Scanner input = new Scanner(System.in);
    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();
    double d = input.nextDouble();
    double e = input.nextDouble();
    double f = input.nextDouble();

    double m = a * e - b * d;
    double x, y;
    if (m == 0){
      System.out.println("The equation has no solution.");
    }
    else {
      x = (d * e - f * b) / (a * e - b * d);
      y = (a * f - d * c) / (a * e - b * d);
      System.out.println("The solution are: x = " + x + ", and y = " + y + ".");
    }
  }
}
