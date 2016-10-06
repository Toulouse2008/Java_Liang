/** Exercise 5.3 Conversion from kilograms to pounds
 *  Write a program that displays the conversion table from kilograms to pounds.
 *  Note 1 kg = 2.2 lb.
 */

 public class Kg2lb {
   public static void main(String[] args) {

     final double KG_TO_LB = 2.2;
     final int UPPER = 200;

     // Output the conversion table from kilogram to pounds
     System.out.println("Kilograms\tPounds");
     for (int kilo = 1; kilo < UPPER; kilo++) {
       double pound = kilo * KG_TO_LB;
       System.out.printf("%-9d\t\b%6.1f\n", kilo, pound);
     }
   }
 }
