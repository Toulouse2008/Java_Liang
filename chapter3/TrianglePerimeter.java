/** Exercise 3.19 Compute the perimeter of a triangle
 *  Write a program that reads three edges for a triangle and
 *  computes the perimeter is the input is valid. Otherwise, displays
 *  "The input is invalid". The input is valid if the sum of every
 *  pair of two edges is greater than the remaining edge.
 */
 import java.util.Scanner;

 public class TrianglePerimeter {
   public static void main(String[] args) {
     // Get the user input
     Scanner input = new Scanner(System.in);
     System.out.println("Enter three edges:");
     double edge1 = input.nextDouble();
     double edge2 = input.nextDouble();
     double edge3 = input.nextDouble();

     // Validate the input and output perimeter
     if (edge1 + edge2 > edge3 && edge1 + edge3 > edge2 && edge2 + edge3 > edge1)
       System.out.println("THe perimeter is " + (edge1 + edge2 + edge3));
     else
       System.out.println("The input is in valid");
   }
 }
