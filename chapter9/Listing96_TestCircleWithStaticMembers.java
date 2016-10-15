/** Listing 9.7 combined with Listing 9.6 Add static variable
 *  to the circle class
 */

 public class Listing96_TestCircleWithStaticMembers{
   /** Main method  */
   public static void main(String[] args){
     System.out.println("Before creating objects");
     System.out.println("Thenumber of circle objcets is " +
          CircleWithStaticMembers.numberOfObjects);

      // Create c1
      CircleWithStaticMembers c1 = new CircleWithStaticMembers();

      // Display c1 before c2 is created
      System.out.println("\nAfter creating c1");
      System.out.println("c1: radius (" + c1.radius +
             ") and number of Circle objects(" +
             c1.numberOfObjects +")");
      CircleWithStaticMembers c2 = new CircleWithStaticMembers(5);

      System.out.println("c2: radius (" + c2.radius +
                    ") and number of Circle objects(" +
                    c2.numberOfObjects +")");
   }
 }
 /**  class circle with static mmebers */
 class CircleWithStaticMembers{
   // The radius of the circle
   double radius;

   //The number of objects created
   static int numberOfObjects = 0;

   // Constructor for a cirlce with radius 1
   CircleWithStaticMembers(){
     radius = 1;
     numberOfObjects++;
   }
   CircleWithStaticMembers(double newRadius){
     radius = newRadius;
     numberOfObjects++;
   }
   static int getNumberOfObjects(){
     return numberOfObjects;
   }
   // Return the area of this circle
   double getArea(){
     return radius * radius * Math.PI;
   }
 }
