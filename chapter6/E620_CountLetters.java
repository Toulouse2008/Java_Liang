/** Exercise 6.20 Count the letters in a String
 *  Write a method that counts the number of letters in a string using
 *  the following header:
 *  public static int countLetters(String s)
 *  Write a test program that prompts the user to enter string and
 *  displays the number of letters in the string.
 */

import java.util.Scanner;

public class E620_CountLetters {
  public static void main(String[] args) {

    // Get the input from the user
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the string: ");
    String str = input.nextLine();

    // Invoke the countLetters method
    int count = countLetters(str);

    // Output result
    System.out.println(count);
  }

  // Define the countLetters method
  public static int countLetters(String s) {
    int number = 0;
    for(int i = 0; i < s.length(); i++) {
      if (Character.isAlphabetic(s.charAt(i)))
        number++;
    }
    return number;
  }
}
