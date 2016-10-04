/** Listing 4.1 Compute Angles
 *  Given the coordinates of the three point in a triangle, calculate
 *  the three angles. Assume the input has already been validated to
 *  form a triangle.
 */
 import java.util.Scanner;

 public class ComputeAngles {
   public static void main(String[] args) {
     // Get input from the user
     Scanner input = new Scanner(System.in);
     System.out.println("Enter the coordinates for the three points:");
     double x1 = input.nextDouble();
     double y1 = input.nextDouble();
     double x2 = input.nextDouble();
     double y2 = input.nextDouble();
     double x3 = input.nextDouble();
     double y3 = input.nextDouble();

     // Calculate the side length
     double a = Math.pow((Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2)), 0.5);
     double b = Math.pow((Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2)), 0.5);
     double c = Math.pow((Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2)), 0.5);

     // Calculate the Angles
     double A = Math.acos((a * a - b * b - c * c) / (-2 * b * c));
     double B = Math.acos((b * b - a * a - c * c) / (-2 * a * c));
     double C = Math.acos((c * c - a * a - b * b) / (-2 * a * b));

     System.out.println("A is " + Math.toDegrees(A) + ", B is " +
            Math.toDegrees(B) + ", C is " + Math.toDegrees(C) + ".");
   }
 }
