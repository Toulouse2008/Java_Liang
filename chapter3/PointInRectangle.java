/** Exercise 3.23 Geometry: point in a rectangle
 *  Write a program that prompts the user to enter a point(x, y) check
 *  whether the point is inside of the rectangle, which centered at (0, 0)
 *  with a width of 10 and height of 5.
 */
 import java.util.Scanner;

 public class PointInRectangle {
   public static void main(String[] args) {
     // Get input from user
     Scanner input = new Scanner(System.in);
     System.out.println("Enter the x and y for the point:");
     double x = input.nextDouble();
     double y = input.nextDouble();

     // Determine if the point is in the rectangle
     if ((x > -5 && x < 5) && (y > -2.5 && y < 2.5))
       System.out.println("Point(" + x + ", " + y + ") is in the rectangle");
     else
       System.out.println("Point(" + x + ", " + y + ") is not in the rectangle");
   }
 }
