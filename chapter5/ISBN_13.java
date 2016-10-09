/** Exercise 5.47 Business: check ISBN-13
 *  ISBN-13 is a new standard for identifying books. It uses 13 digits. The last
 *  digit d13 is a checksum.
 *  10 - (d1 + 3d2 + d3 + 3d4 + d5 + 3d6 + d7 + 3d8 + d9 + 3d10 + d11 + 3d12)%10
 *  if checksum is 10, replace it with 0.
 *  Write a program that read 12 digits and calculate the d13.
 */

import java.util.Scanner;

public class ISBN_13 {
  public static void main(String[] args) {

    // Get the input from the user
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the 12 digits: ");
    String isbn = input.nextLine();

    // Validate the input
    if (isbn.length() != 12) {
      System.out.println(isbn + "is an invalid input!");
      System.exit(1);
    }

    // Calculate d13 and output it
    int sum = 0;
    for (int i = 0; i < isbn.length(); i++) {
      if (i % 2 == 0)
        sum += (int)(isbn.charAt(i)) - (int)('0');
      else
        sum += 3 * ((int)(isbn.charAt(i)) - (int)('0'));
    }
    int d_13 = 10 - sum % 10;
    if (d_13 == 10)
      d_13 = 0;
    System.out.println("The ISBN-13 number is " + isbn + d_13);
  }
}
