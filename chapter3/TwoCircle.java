/** Exercise 3.29 Geometry: two circles
 *  Write a program that prompts the user to enter the centers and
 *  radii of two circles and determine the relative position of the
 *  two circles
 */

 import java.util.Scanner;

 public class TwoCircle {
   public static void main(String[] args) {
     // Get input from user
     Scanner input = new Scanner(System.in);
     System.out.println("Enter the center1(x1, y1), and r1:");
     double x1 = input.nextDouble();
     double y1 = input.nextDouble();
     double r1 = input.nextDouble();
     System.out.println("Enter the center2(x2, y2), and r2:");
     double x2 = input.nextDouble();
     double y2 = input.nextDouble();
     double r2 = input.nextDouble();

     // Caculate the distance between two centers
     double d = Math.pow(((x1 - x2) * (x1 - x2) +
                          (y1 - y2) * (y1 - y2)), 0.5);
     // Determine the relative position
     if (d == r1 + r2)
       System.out.println("The two circles circumscribe");
     else if ((d == r1 - r2) || (d == r2 - r1))
       System.out.println("The two circles inscribe");
     else if (d > r1 + r2)
       System.out.println("The two circles are far away");
     else if ((d < r1 + r2) && (d > r1 - r2 || d > r2 - r1))
       System.out.println("The two circles intersect");
     else
       System.out.println("One circle is in the other");
   }
 }
