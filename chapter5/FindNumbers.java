/** Find number divisible by 5 and 6
 *  Write a program that displays all the numbers from 100 to 1000, ten per line
 *  that divisible by 5 and 6. Nubers are separated by exactly one space.
 */

 public class FindNumbers {
   public static void main(String[] args) {

     int count = 0;
     int number = 0;
     for (number = 100; number <= 1000; number++) {
       if (number % 5 == 0 && number % 6 == 0) {
         System.out.print(number + " ");
         count++;
         if (count % 10 == 0 && count != 0) {
           System.out.println();
         }
       }
     }

   }
 }
