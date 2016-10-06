/** Exercise 5.6 Conversion from miles to kilometers
 *  Write a program that displays conversion table upto 10 miles and upto 65 km
 *  to miles.
 *  Note 1 mile = 1.609 km
 */

 public class MileAndKm {
   public static void main(String[] args) {

     final double MILE_TO_KM = 1.609;
     final int UPPER = 10;
     int kilometers = 20;

     // Output the table
     System.out.println("Miles\tKilometers\t|\tKilometers\tMiles");
     for (int mile = 1; mile <= UPPER; mile++) {
       double km = mile * MILE_TO_KM;
       double miles = kilometers / 1.609;
       System.out.printf("%-5d\t%-10.3f\t|\t%-10d\t%6.3f\n", mile, km, kilometers, miles);
       kilometers += 5;
     }
   }
 }
