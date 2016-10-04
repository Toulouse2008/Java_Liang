/** Exercise 4.9 Find unicode of a character
  *  Write a program that receives a character and displays its unicode.
  */

  import java.util.Scanner;

  public class Char2Unicode {
    public static void main(String[] args) {

      // Get input from the user
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a unicode character:");
      String s = input.nextLine();
      char ch = s.charAt(0);

      // Display the corresponding character
      int number = (int)ch;
      System.out.println("The unicode for the character " + ch + " is " + number);

    }
  }
