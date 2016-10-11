/** Exercise 6.18 Check password
 *  Some websites impose certain rules for passwords. Write a method that checks
 *  whether a string is a valid password. Suppose the password rules are as
 *  follows: 1. at least eight chars; 2. contains only letters and digits;
 *  3. contains at least two digits.
 */

import java.util.Scanner;

public class E618_CheckPassword {
  public static void main(String[] args) {

    // Get the input from the user
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the password: ");
    String passWord = input.nextLine();

    // Invoke the checkPassword method
    checkPassword(passWord);
  }

  /** Define the checkPassword method which further contains three separated
   *  methods to validate the input
   */
  // Define the method which will call the other three method to validate input
  public static void checkPassword(String s) {
    if (checkLength(s) && checkContains(s) && checkDigits(s))
      System.out.println("Valid password");
    else
      System.out.println("Invalid password");
  }

  // Define the method to check the length
  public static boolean checkLength(String s) {
    if(s.length() >= 8)
      return true;
    else
      return false;
  }

  // Define the method to check the letters and digits
  public static boolean checkContains(String s) {
    int count = 0;
    char ch = ' ';
    for (int i = 0; i < s.length(); i++) {
      ch = s.charAt(i);
      if(Character.isLetterOrDigit(ch))
        count++;
    }
    if (count == s.length())
      return true;
    else
      return false;
  }

  // Define the method that check at least two digits
  public static boolean checkDigits(String s) {
    int count = 0;
    char ch = ' ';
    int length = s.length();
    for (int i = 0; i < length; i++) {
      ch = s.charAt(i);
      if(Character.isDigit(ch))
        count++;
    }
    if (count >= 2)
      return true;
    else
      return false;
  }

}
