/** Exercise 3.27 Geometry: Points in triangle?
 *  The right-angle point is placed at (0, 0), and the other two points
 *  are placed at (200, 0) and (0, 100). Write a program to prompts user
 *  to enter a point(x, y), and determines whether the point is in the
 *  triangle.
 */
 import java.util.Scanner;

 public class PointInTriangle {
   public static void main(String[] args) {
     // Get input from user
     Scanner input = new Scanner(System.in);
     System.out.println("Enter x and y for a point:");
     double x = input.nextDouble();
     double y = input.nextDouble();

     // Determine if the point is in the triangle
     // Conditions: 0 < x < 200 && 0 < y < 100 && y - x = 100
     if ((x > 0 && x < 200) && (y > 0 && y < 100) && (y + x > 0 && y + x < 100))
        System.out.println("Point(" + x + ", " + y + ") is in the triangle");
     else
        System.out.println("Point(" + x + ", " + y + ") in not in triangle");
   }
 }
