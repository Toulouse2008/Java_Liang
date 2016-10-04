/** Exercise 4.1 Geometry: Area of a pentagon
 *  Write a program that prompts the user to enter the length
 *  from the center of a pentagon to a vertex and computes the
 *  area of the pentagon. Formula:
 *  Area = (5 * s * s) / (4 * tan(pi/5)), s = 2 * r * sin(pi/5).
 */

 import java.util.Scanner;

 public class PentagonArea {
   public static void main(String[] args) {

     // Get input from the user
     Scanner input = new Scanner(System.in);
     System.out.println("Enter the length from the center to a vertex:");
     double r = input.nextDouble();

     // Calculate the area
     double s = 2 * r * Math.sin(Math.PI / 5);
     double area = 5 * s * s / (4 * Math.tan(Math.PI / 5));

     // Output the result
     System.out.printf("The area of the pentagon is %4.2f\n", area);
   }
 }
