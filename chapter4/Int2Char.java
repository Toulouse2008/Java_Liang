/** Exercise 4.8 Find the character of an ASCII code
 *  Write a program that receives an ASCII code (an integer between 0
 *  to 127) and displays its character.
 */

 import java.util.Scanner;

 public class Int2Char {
   public static void main(String[] args) {

     // Get input from the user
     Scanner input = new Scanner(System.in);
     System.out.println("Enter an integer(0 to 127):");
     int number = input.nextInt();

     // Display the corresponding character
     char ch = (char)number;
     System.out.println("The character for ASCII code " + number + " is " + ch);

   }
 }
