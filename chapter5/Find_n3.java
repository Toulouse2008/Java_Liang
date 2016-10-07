/** Exercise 5.13 Find the largest n such that n**3 > 12000
 *  Use while loop to find the largest integer such that n**3 < 12000.
 */
 public class Find_n3 {
   public static void main(String[] args) {

   int number = 0;
   // Find the largest number whose square is smaller than 12000
   while (number * number * number <= 12000) {
     number++;
   }
   System.out.println(number);
   }
 }
