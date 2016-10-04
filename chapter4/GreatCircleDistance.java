/** Exercise 4.2 Geometry: great circle distance
 *  The great circle distance is the distance between two
 *  points on the surface of a sphere. Let (x1,y1) and (x2, y2)
 *  be the geographic latitude and longitude of two points. The
 *  great circle distance between the two points can be computed
 *  using the following formula:
 *  d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) *cos(y1 -y2))
 *  Write a program that prompts the user to enter the latitude and longitude
 *  of two points on the earth in degrees and displays its great distance.
 *  The average earth radius is 6371.01km. Note: convert degrees to radians using
 *  Math.toRadians method.
 */

 import java.util.Scanner;

 public class GreatCircleDistance {
   public static void main(String[] args) {

     // Get input from the user
     Scanner input = new Scanner(System.in);
     System.out.println("Enter point1(latitude and longitude) in degrees:");
     double x1 = input.nextDouble();
     double y1 = input.nextDouble();
     System.out.println("Enter point2(latitude and longitude) in degrees:");
     double x2 = input.nextDouble();
     double y2 = input.nextDouble();

     // Convert degrees to radians
     x1 = Math.toRadians(x1);
     x2 = Math.toRadians(x2);
     y1 = Math.toRadians(y1);
     y2 = Math.toRadians(y2);

     // Calculate the great distance
     double distance = 6371.01 * Math.acos(Math.sin(x1) * Math.sin(x2) +
                Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
     System.out.println("The distance between the two points is " + distance + " km");
   }
 }
