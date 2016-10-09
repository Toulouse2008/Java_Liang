/** Exercise 5.48 Process String
 *  Write a program that prompts the user enter a string and displays the characer
 *  at odd positions
 */

import java.util.Scanner;

public class ProcessString {
  public static void main(String[] args) {

    // Get the input from the user
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the string: ");
    String str = input.nextLine();

    // Outpu the chars in odd positions
    for (int i = 0; i < str.length() / 2; i++) {
      char ch = str.charAt(2 * i + 1);
      System.out.print(ch);
    }
    System.out.println();
    
  }
}
