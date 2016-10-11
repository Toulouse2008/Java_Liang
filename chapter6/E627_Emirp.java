/** Exercise 6.27 Emirp
 *  An emirp (prime spelled backward) is a nonpalindromic prime number
 *  whose reversal is also a prime, for example 17. Write a program to display
 *  the first 100 such numbers, and display them 10 per line separated
 *  by one space.
 */

import java.util.Scanner;

public class E627_Emirp {
  public static void main(String[] args) {

    // Get the input from the user
    Scanner input = new Scanner(System.in);
    System.out.println("Enter how many numbers to be found:");
    int total = input.nextInt();

    // Invoke the isEmirp method
    isEmirp(total);

    System.out.println();
  }

  /** Define the isEmirp method */
  public static void isEmirp(int n) {
    int num = 2;
    int count = 0;
    while (count <= n) {
      if (isPrime(num) && isReversePrime(num) && (!isPalindromic(num))) {
        count++;
        if (count % 10 == 0 && count != 0)
          System.out.printf("%8d\n", num);
        else
          System.out.printf("%8d ", num);
      }
      num++;
    }
  }

  /** Define isPrime method */
  public static boolean isPrime(int n1) {
    boolean truth = true;
    for (int i = 2; i < n1 / 2; i++) {
      if (n1 % i == 0)
        truth = false;
    }
    return truth;
  }

  /** Define isReversePrime method */
  public static boolean isReversePrime(int n2) {
    int rNumber = 0;
    int temp = n2;
    if (n2 < 10)
      return true;
    else {
      while (temp > 10) {
        rNumber = rNumber * 10 + temp % 10;
        temp = temp / 10;
      }
      rNumber = rNumber * 10 + temp;
      if (isPrime(rNumber))
        return true;
      else
        return false;
    }
  }

  /** Define isPalindromic method */
  public static boolean isPalindromic(int n2) {
    int rNumber = 0;
    int temp = n2;
    if (n2 < 10)
      return true;
    else {
      while (temp > 10) {
        rNumber = rNumber * 10 + temp % 10;
        temp = temp / 10;
      }
      rNumber = rNumber * 10 + temp;
      if (rNumber == n2)
        return true;
      else
        return false;
    }
  }

}
