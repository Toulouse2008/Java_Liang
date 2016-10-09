/** Exercise 5.24 Sum a series
 *  Write a program to sum the following series:
 *  1/3 + 3/5 + 5/7 + ... + 95/97 + 97/99
 */

 public class SumSeries {
   public static void main(String[] args) {

     double sum = 0;
     for (int i = 1; i <= 97; i += 2) {
       sum += 1.0 * i / (i + 2);
     }
     System.out.println("The sum is " + sum);
   }
 }
