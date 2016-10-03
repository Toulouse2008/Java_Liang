/** Exercise 3.22 Geometry: Point in a circle ?
 *  Write a program that prompts the user to enter a point(x, y) and checks
 *  whether the point is within the circle centered at (0, 0) with a radius of
 *  10.
 */
 import java.util.Scanner;

 public class PointInCircle {
   public static void main(String[] args) {
     // Get input from user
     Scanner input = new Scanner(System.in);
     System.out.println("Enter x and y for a point:");
     double x = input.nextDouble();
     double y = input.nextDouble();

     // Calculate distance from origin (0, 0)
     double d = Math.pow(x * x + y * y, 0.5);

     // Determine whether the point is inside of the circle
     if (d < 10) {
       System.out.println("Point(" + x + ", " + y + ") is in the circle");
     }
     else {
       System.out.println("Point(" + x + ", " + y + ") is not in the circle");
     }
   }
 }
