/** Exercise 5.50 Count uppercase letters
 *  Write a program that prompts the user to enter a string and displays the
 *  number of the uppercase letters in the string.
 */

import java.util.Scanner;

public class CountUppercase {
  public static void main(String[] args) {

    // Get the input from the user
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the string: ");
    String str = input.nextLine();
    char ch = ' ';
    int count = 0;

    for (int i = 0; i < str.length(); i++) {
      ch = str.charAt(i);
      if ((int)ch - (int)'A' >= 0 && (int)ch - (int)'Z' <= 0)
        count++;
    }
    System.out.println("The number of uppercase letters is: " + count);
  }
}
