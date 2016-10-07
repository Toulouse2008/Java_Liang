/** Exercise 5.14 Compute the greatest common divisor
 *  Another solution for Listing 5.9 to find the greatest common divisor of two
 *  integers n1 and n2 is as follows: First find d to be the minimum of n1 and n2,
 *  then check whether d, d-1, d-2, ..., 2 or 1 is a divisor for both n1 and n2.
 *  The first such common divisor is the greatest common divisor for n1 and n2.
 */

 import java.util.Scanner;

 public class Findgcd {
   public static void main(String[] args) {

     // Get the input from the user
     System.out.println("Enter two integers: ");
     Scanner input = new Scanner(System.in);
     long n1 = input.nextInt();
     long n2 = input.nextInt();


     // Compute the gcd
     // Find the bigger and smaller number
     long d = 0;
     long bigger = 0;
     long gcd = 0;
     if (n1 > n2){
       d = n2;
       bigger = n1;
     }
     else {
       d = n1;
       bigger = n2;
     }

     // Find the gcd
     if (bigger % d == 0)
       gcd = d;
     else {

       while (bigger % d != 0 && d > 0) {
         d = d - 1;
       }
       System.out.println(d);
     }

   }
 }
