/** Exercise 6.4 Display an integer reversed
 *  Write a method with the follow header to display an integer in
 *  reverse order.
 */

import java.util.Scanner;

public class ReverseInt {
  public static void main(String[] args) {

    // Get the input from the user
    System.out.println("Enter a positive nubmer (not end with zeros): ");
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();

    // Reverse the number
    System.out.println(number + " reversed is " +reverseInt(number));
  }

  // Define the method
  public static int reverseInt(int n) {
    int temp = 0;
    if (n < 10)
      return n;
    else {
      while (n > 10) {
        temp = temp * 10 + n % 10;
        n = n / 10;
      }
      temp = temp * 10 + n;
    }
    return temp;
  }
}
