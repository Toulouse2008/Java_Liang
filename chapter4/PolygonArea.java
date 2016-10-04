/** Exercise 4.5 Geometry: Area of a polygon
 *  Write a program that prompts the user to enter the number of sides
 *  and side length, then computes and displays the area. Formula:
 *  Area = (n * s * s) / (4 * tan(pi/n))
 */

 import java.util.Scanner;

 public class PolygonArea {
   public static void main(String[] args) {

     // Get input from the user
     Scanner input = new Scanner(System.in);
     System.out.println("Enter the number of sides:");
     double n = input.nextDouble();
     System.out.println("Enter the side length:");
     double s = input.nextDouble();

     // Calculate the area
     double area = n * s * s / (4 * Math.tan(Math.PI / n));

     // Output the result
     System.out.printf("The area of the Polygon is %4.2f\n", area);
   }
 }
