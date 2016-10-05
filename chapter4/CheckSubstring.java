/** Exercise 4.22 Check substring
 *  Write a program that prompts the user to enter two strings and reports whether
 *  the second string is a substring of the first string.
 */

 import java.util.Scanner;

 public class CheckSubstring {
   public static void main(String[] args) {

     // Get input from the user
     Scanner input = new Scanner(System.in);
     System.out.println("Enter string s1:");
     String s1 = input.nextLine();
     System.out.println("Enter string s2:");
     String s2 = input.nextLine();

     // Check and output results
     if (s1.contains(s2)) {
       System.out.println(s2 + " is a substring of " + s1);
     }
     else
       System.out.println(s2 + " is not a substring of " + s1);
   }
 }
