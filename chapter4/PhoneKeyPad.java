/** Exercise 4.15 Phone key pads
 *  Write a program to match the internationl statdard letter/number map found
 *  on the telephone.
 */

import java.util.Scanner;

public class PhoneKeyPad {
  public static void main(String[] args) {

    // Get input from the user
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a letter:");
    String s = input.nextLine();
    char ch = s.charAt(0);

    // Validate input and output result
    if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
      if (ch == 'A' || ch == 'a' || ch == 'B' || ch == 'b' ||
         ch == 'C' || ch == 'c')
        System.out.println("The corresponding number is 2");
      else if (ch == 'D' || ch == 'd' || ch == 'E' || ch == 'e' ||
         ch == 'F' || ch == 'f')
        System.out.println("The corresponding number is 3");
      else if (ch == 'G' || ch == 'g' || ch == 'H' || ch == 'h' ||
               ch == 'I' || ch == 'i')
        System.out.println("The corresponding number is 4");
      else if (ch == 'J' || ch == 'j' || ch == 'K' || ch == 'k' ||
               ch == 'L' || ch == 'l')
        System.out.println("The corresponding number is 5");
      else if (ch == 'M' || ch == 'm' || ch == 'N' || ch == 'n' ||
               ch == 'O' || ch == 'o')
        System.out.println("The corresponding number is 6");
      else if (ch == 'P' || ch == 'p' || ch == 'Q' || ch == 'q' ||
               ch == 'R' || ch == 'r' || ch == 'S' || ch == 's')
        System.out.println("The corresponding number is 7");
      else if (ch == 'T' || ch == 't' || ch == 'U' || ch == 'u' ||
               ch == 'V' || ch == 'v')
        System.out.println("The corresponding number is 8");
      else
        System.out.println("The corresponding number is 9");
    }
    else {
      System.out.println(ch + " is an invalid input");
    }

  }
}
