/** Listing 6.6  greatest common divisor method  */

import java.util.Scanner;

public class GreatestCommonDivisor {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the first integer: ");
    int n1 = input.nextInt();
    System.out.print("Enter the second integer: ");
    int n2 = input.nextInt();

    System.out.println("The greatest common divisor for " + n1 + " and " +
           n2 + " is " + gcd(n1, n2));

    System.out.println("The smallest common fold for " + n1 + " and " +
           n2 + " is " + CommonFold(n1, n2));
  }
  /** GCD method to two integers */
  public static int gcd(int n1, int n2){
    int gcd = 1;
    int k = 2;

    while(k <= n1 && k <= n2){
      if(n1 % k == 0 && n2 % k == 0)
        gcd = k;
      k++;
    }
    return gcd;
  }
  /** Smallest common fold */
  public static int CommonFold(int n1, int n2){
    int scf = 1;
    int mid = bigger(n1, n2);
    while(( mid % n1 != 0) && (mid % n2 != 0))
      mid++;
    return mid;
  }

  public static int bigger(int n1, int n2){
    int temp;
    if (n1 > n2)
      temp = n1;
    else
      temp = n2;
    return temp;
  }
}
