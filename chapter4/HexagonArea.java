/** Exercise 4.4 Geometry: Area of a hexagon
 *  Write a program that prompts the user to enter the side length
 *  and computes the area of the hexagon. Formula:
 *  Area = (6 * s * s) / (4 * tan(pi/6))
 */

 import java.util.Scanner;

 public class HexagonArea {
   public static void main(String[] args) {

     // Get input from the user
     Scanner input = new Scanner(System.in);
     System.out.println("Enter the side length:");
     double s = input.nextDouble();

     // Calculate the area
     double area = 6 * s * s / (4 * Math.tan(Math.PI / 6));

     // Output the result
     System.out.printf("The area of the hexagon is %4.2f\n", area);
   }
 }
