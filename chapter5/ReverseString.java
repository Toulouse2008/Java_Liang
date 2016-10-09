/** Exercise 5.46 Reverse a string
 *  Write a program that prompts the user to enter a string and displays the
 *  string in reverse order.
 */

import java.util.Scanner;

public class ReverseString {
  public static void main(String[] args) {

    // Get the string from the user
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the string: ");
    String str = input.nextLine();
    String rStr = "";

    // Method 1 Reverse the string and store the reversed one
    for (int i = str.length() - 1; i >= 0; i--) {
      rStr += str.charAt(i);
    }
    System.out.println(rStr);

    // Method 2 print single letter directly instead of making another string
    for (int i = str.length() - 1; i >= 0; i--) {
      System.out.print(str.charAt(i));
    }
    // Extra line
    System.out.println();
  }
}
