/** Exercise 5.11 Find number divisible by 5 or 6 but not both
 *  Write a program that displays all the numbers from 100 to 200, ten per line
 *  that divisible by 5 or 6, but not both. Nubers are separated by exactly one space.
 */

 public class FindNumber {
   public static void main(String[] args) {

     int count = 0;
     int number = 0;
     for (number = 100; number <= 200; number++) {
       if ((number % 5 == 0 || number % 6 == 0) && !(number % 5 == 0 && number % 6 == 0)) {
         System.out.print(number + " ");
         count++;
         if (count % 10 == 0 && count != 0) {
           System.out.println();
         }
       }
     }
     System.out.println();

   }
 }
