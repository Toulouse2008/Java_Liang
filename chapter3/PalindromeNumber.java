/** Exercise 3.12 Write a program that prompts the user to enter a
 *  three digit integer and determines whether it is a palindrome
 *  number.
 */
 import java.util.Scanner;

 public class PalindromeNumber {
   public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     // Get an integer from the user
     System.out.println("Enter a three-digit integer:");
     int number = input.nextInt();

     // Determine if it's a palindrome number or not
     int thirdDigit = number % 10;
     int firstDigit = number / 100;
     if (thirdDigit == firstDigit)
       System.out.println(number + " is a palindrome number.");
     else
       System.out.println(number + " is not a palindrome number.");
   }
 }
