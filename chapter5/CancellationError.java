/** Exercise 5.23 Demonstrate cancellation errors
 *  A cancellation error occurs when you are manipulating a very large number with
 *  a very small number. The large number may cancel out the small number. For
 *  example, the result of 10000000.0 + 0.000000000001 is equal to 10000000.0.
 *  To avoid cancellation errors and obtain a more accurate results, carefully
 *  select the order of computation. Write a program to demonstrate the cancellation
 *  error with the series:
 *  1 + 1/2 + 1/3 +... + 1/n
 *  up to n = 50000.
 */

 public class CancellationError {
   public static void main(String[] args) {

     double sum1 = 0;
     double sum2 = 0;
     for (int n = 1; n <= 1000000; n++) {
        sum1 += 1.0 / n;
     }
     for (int n = 1000000; n > 0; n--) {
       sum2 += 1.0 / n;
     }
     System.out.printf("Large to samll: %7.6f\nSmall to large: %7.6f\n", sum1, sum2);
     System.out.println("Did not show any difference! ");
   }
 }
