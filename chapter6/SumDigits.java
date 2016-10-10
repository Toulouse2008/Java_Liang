/** Exercise 6.2 Sum the digits in an integer
 *  Write a method that computes the sum of the digits in an integer.
 *  output the sum of all the digits till to only one digit
 */

import java.util.Scanner;

public class SumDigits{
  public static void main(String[] args){

    // Get the input from the user
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an integer:");
    long number = input.nextInt();
    System.out.printf("%d\n", (int)sumDigits(number));
  }

  // Define the method that adds digits till to one digits
  public static long sumDigits(long n){
    int temp = 0;
    while(n >= 10){
      n = n % 10 + n/10;
    }
    return temp + n;
  }
}
