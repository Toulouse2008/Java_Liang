/** Exercise 5.4 Conversion from miles to kilometers
 *  Write a program that displays conversion table upto 10 miles.
 *  Note 1 mile = 1.609 km
 */

 public class Mile2Km {
   public static void main(String[] args) {

     final double MILE_TO_KM = 1.609;
     final int UPPER = 10;

     // Output the table
     System.out.println("Miles\tKilometers");
     for (int mile = 1; mile <= UPPER; mile++) {
       double km = mile * MILE_TO_KM;
       System.out.printf("%-5d\t%-10.3f\n", mile, km);
     }
   }
 }
