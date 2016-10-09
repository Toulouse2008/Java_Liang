/** Exercise 5.25 Compute Pi
 *  Write a program that displays the pi value for i = 10000, 20000, ..., and
 *  100000.
 */

 public class ComputePi {
   public static void main(String[] args) {
     // Increment of the number of items
     int n = 10000;
     while (n <= 100000) {
       double pi = 0;
       double decimalPart = 0;
       // Calculate decimal part
       for (int i = 1; i <= n; i++) {
         decimalPart += (Math.pow((double)(-1), (double)(i+1))) / (2 * i - 1);
       }
       // Calculate pi and output the result
       pi = 4 * decimalPart;
       System.out.printf("Pi for %d is %9.8f\n", n, pi);
       n += 10000;
     }

   }
 }
