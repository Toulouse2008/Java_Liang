/** Exercise 5.12 Find the samllest n such that n**2 > 12000
 *  Use while loop to find the smallest integer such that n**2 > 12000.
 */
 public class Find_n2 {
   public static void main(String[] args) {

   int number = 0;
   // Find the samllest number whose square is greater than 12000
   while (number * number <= 12000) {
     number++;
   }
   System.out.println(number);
   }
 }
