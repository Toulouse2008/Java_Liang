/** Exercise 3.16 Random point.
 *  Write a program that displays a random coordinate in a rectangle. The
 *  rectangle is centered at (0, 0) with width 100 and height 200.
 */
 public class RandomPoint {
   public static void main(String[] args) {

     // Get random x and y inside of the rectangle
     double x = Math.random() * 100 - 50;
     double y = Math.random() * 200 - 100;

     // Output the results
     System.out.println("point(" + x + "," + y +")");
   }
 }
