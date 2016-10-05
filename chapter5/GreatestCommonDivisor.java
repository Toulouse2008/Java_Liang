/** Listing 5.9 Greatest common divisor  */

import java.util.Scanner;

public class GreatestCommonDivisor {
  public static void main(String[] args) {

    // Get the inputs from the user
    Scanner input = new Scanner(System.in);
    System.out.println("Enter two integers: ");
    int num1 = input.nextInt();
    int num2 = input.nextInt();

    // Initial gcd is 1
    int gcd =1;
    // Possible gcd
    int k = 2;
    // Find gcd
    while (k <= num1 && k <= num2) {
      if (num1 % k == 0 && num2 % k == 0)
        gcd = k;
      k++;
    }
    System.out.println("The greatest common divisor for " + num1 +
           " and " + num2 + " is " + gcd);
  }
}
