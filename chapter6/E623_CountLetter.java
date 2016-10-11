/** Exercise 6.23 Occurrences of a specified character
 *  Write a method that finds the number of occurrences of a specified
 *  character in a string using the following header:
 *  public static int count(String str, char a)
 *  Write a test program that prompts the user to enter a string
 *  followed by a character and displays the number of occurrences of the
 *  character in the string.
 */

import java.util.Scanner;

public class E623_CountLetter {
  public static void main(String[] args) {

    // Get the input from the user
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the string: ");
    String str = input.nextLine();
    System.out.println("Enter the character: ");
    String s = input.next();
    char  ch = s.charAt(0);

    // Invoke the countLetter method
    int count = countLetter(str, ch);

    // Output result
    System.out.println(count);
  }

  /** Define the countLetter method */
  public static int countLetter(String str, char a) {
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == a) {
        count++;
      }
    }
    return count;
  }
  
}
