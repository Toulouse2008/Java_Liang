/** Exercise 3.34 Geometry: point on line segment
 *  Revise E3.32, to determine if p2 is on the segment of p0 to p1
 */
 import java.util.Scanner;

 public class PointOnLineSegment {
   public static void main(String[] args) {
     // Get input from the user
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

     // Calculate distance from p0 to p1, p0 to p2, and p1 to p2
     double p0p1 = Math.pow(((x0 - x1) * (x0 - x1) +
                            (y0 - y1) * (y0 -y1)), 0.5);
     double p0p2 = Math.pow(((x0 - x2) * (x0 - x2) +
                            (y0 - y2) * (y0 -y2)), 0.5);
     double p1p2 = Math.pow(((x1 - x2) * (x1 - x2) +
                            (y1 - y2) * (y1 -y2)), 0.5);
     if (p0p1 == (p0p2 + p1p2))
       System.out.println("P2 is on the line segment from p0 to p1.");
     else
       System.out.println("P2 is not on the line segment from p0 to p1.");
   }
 }
