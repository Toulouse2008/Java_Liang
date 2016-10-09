/** Exercise 5.51 Longest common prefix
 *  Write a program that prompts the user to enter two strings and displays the
 *  largest common prefix of the two strings.
 */

import java.util.Scanner;

public class CommonPrefix {
  public static void main(String[] args) {

    // Get the inputs from the user
    Scanner input = new Scanner(System.in);
    System.out.println("Enter two strings(one per line): ");
    String str1 = input.nextLine();
    String str2 = input.nextLine();

    // Calculate the common prefix
    String common = "";
    String temp = "";
    // Find the longest string
    if (str1.length() < str2.length()) {
      temp = str2;
      str2 = str1;
      str1 = temp;
    }
    for (int i = 0; i < str2.length(); i++) {
      if (str2.charAt(i) == str1.charAt(i))
        common += str2.charAt(i);
      else
        break;
    }
    System.out.println("The common prefix is " + common);
  }
}
