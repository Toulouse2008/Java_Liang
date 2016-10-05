/** Exercise 4.20 Process a String
 *  Write a program that prompts the user to enter a string and displays its
 *  length and its first character.
 */

import java.util.Scanner;

public class ProcessString {
  public static void main(String[] args) {

    // Get input from the user
    Scanner input = new Scanner(System.in);
    System.out.println(System.in);
    String str = input.nextLine();

    // Calculate and output result
    char ch = str.charAt(0);
    int length = str.length();
    System.out.println("The length is " + length + ". The first character is " + ch);
  }
}
