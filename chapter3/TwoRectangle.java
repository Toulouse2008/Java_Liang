/** Exercise 3.28 Geometry: two rectangles
 *  Write a program that prompts the user to enter the center (x, y),
 *  width, and height of two rectangles and determines whether one is
 *  inside of the other or overlaps.
 */
 import java.util.Scanner;

 public class TwoRectangle {
   public static void main(String[] args) {
     // Get input from the user
     Scanner input = new Scanner(System.in);
     System.out.println("Enter center1(x1, y1), width1, height1:");
     double x1 = input.nextDouble();
     double y1 = input.nextDouble();
     double width1 = input.nextDouble();
     double height1 = input.nextDouble();
     System.out.println("Enter center2(x2, y2), width2, height2:");
     double x2 = input.nextDouble();
     double y2 = input.nextDouble();
     double width2 = input.nextDouble();
     double height2 = input.nextDouble();

     // Calculate ranges
     double xLower1 = x1 - width1 / 2;
     double xUpper1 = x1 + width1 / 2;
     double yLower1 = y1 - height1 / 2;
     double yUpper1 = y1 + height1 / 2;
     double xLower2 = x2 - width2 / 2;
     double xUpper2 = x2 + width2 / 2;
     double yLower2 = y2 - height2 / 2;
     double yUpper2 = y2 + height2 / 2;

     // Determine the situation of the two rectangles
     if ((xLower2 == xLower1) && (xUpper2 == xUpper1) &&
         (yLower2 == yLower1) && (yUpper2 == yUpper1))
       System.out.println("r1 and r2 are the same");
     else if ((xLower2 > xLower1) && (xUpper2 < xUpper1) &&
              (yLower2 > yLower1) && (yUpper2 < yUpper1))
       System.out.println("r2 is in r1");
     else if ((xLower2 < xLower1) && (xUpper2 > xUpper1) &&
              (yLower2 < yLower1) && (yUpper2 > yUpper1))
       System.out.println("r1 is in r2");
     else if (((yUpper1 > yUpper2 && yLower1 < yUpper2) ||
              (yLower2 > yLower1 && yLower2 < yUpper1)) &&
              ((xUpper2 < xUpper1) && (xUpper2 > xLower1) ||
              (xLower2 < xUpper1) && (xLower2 > xLower1)))
       System.out.println("r1 overlaps r2");
     else
       System.out.println("r1 is far away from r2");
   }
 }
