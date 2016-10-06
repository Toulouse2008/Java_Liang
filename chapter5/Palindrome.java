/** Listing 5.14 Palindrome    */

import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {

    // Get the input from the user
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a string:");
    String s = input.nextLine();

    // The index of the first character in the String
    int low = 0;
    // The index of the last character in the String
    int high = s.length() - 1;

    boolean isPalindrome = true;
    while (low < high) {
      if (s.charAt(low) != s.charAt(high)) {
        isPalindrome = false;
        break;
      }
      low++;
      high--;
    }

    // Output result
    if (isPalindrome == true)
      System.out.println(s + " is a panlindrome");
    else
      System.out.println(s + " is not a palindrome");
  }
}
