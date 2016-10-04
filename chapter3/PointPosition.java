/** Exercise 3.32 Geometry: Point Position
 *  Given a directed line from point p0(x0, y0) to p1(x1, y1), you
 *  can use the following condition to decide whether a point2(x2, y2)
 *  is on the left, right of the line or on the same line corresponding
 *  to d > 0, d < 0 or d = 0:
 *  d = (x1 -x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)
 *  Write a program that prompts the user to enter the three points and
 *  displays the relative position.
 */

 import java.util.Scanner;

 public class PointPosition {
   public static void main(String[] args){
     // Get input from user
     Scanner input = new Scanner(System.in);
     System.out.println("Enter x0 and y0 for p0:");
     double x0 = input.nextDouble();
     double y0 = input.nextDouble();
     System.out.println("Enter x1 and y1 for p1:");
     double x1 = input.nextDouble();
     double y1 = input.nextDouble();
     System.out.println("Enter x2 and y2 for p2:");
     double x2 = input.nextDouble();
     double y2 = input.nextDouble();

     // Calculate the value of the formula
     double d = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
     if (d > 0)
       System.out.println("(" + x2 + ", " + y2 +
              ") is on the left of the line from p0 to p1");
     else if (d == 0)
       System.out.println("(" + x2 + ", " + y2 +
            ") is on the line from p0 to p1");
     else
       System.out.println("(" + x2 + ", " + y2 +
            ") is on the right of the line from p0 to p1");
   }
 }
