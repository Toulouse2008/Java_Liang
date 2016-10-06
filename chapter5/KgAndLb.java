/** Exercise 5.5 Conversion from kilograms to pounds and pounds to kilograms
 *  Write a program that displays the conversion table from kilograms to pounds
 *  and pounds to kilograms.
 *  Note 1 kg = 2.2 lb.
 */

 public class KgAndLb {
   public static void main(String[] args) {

     final double KG_TO_LB = 2.2;
     final int UPPER = 200;

     // Output the conversion table from kilogram to pounds
     int lb = 20;
     System.out.println("Kilograms\tPounds\t|\tPounds\tKilograms");

     for (int kilo = 1; kilo < UPPER; kilo++) {
       double pound = kilo * KG_TO_LB;
       if (lb < 520){
         double kg = lb / 2.2;
         System.out.printf("%-9d\t%6.1f\t|\t%-7d\t%9.2f\n", kilo, pound, lb, kg);
         lb += 5;
       }
       else
         System.out.printf("%-9d\t%6.1f\t|\n", kilo, pound);
       }
   }
 }
