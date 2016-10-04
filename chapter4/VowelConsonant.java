/** Exercise 4.13 Vowel or consonant
 *  Write a program that prompts the user to enter a letter and check whether
 *  the letter is a vowel or consonant.
 */

 import java.util.Scanner;

 public class VowelConsonant {
   public static void main(String[] args) {

     // Get the input from the user
     Scanner input = new Scanner(System.in);
     System.out.println("Enter a letter:");
     String s = input.nextLine();
     char ch = s.charAt(0);

     // Calculate and output result
     if (ch == 'a' || ch == 'A' || ch =='e' || ch == 'E' || ch == 'i' ||
         ch == 'I' || ch == 'o' || ch == 'O')
       System.out.println(ch + " is a vowel");
     else if (((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) &&
             ((ch != 'a' || ch != 'A' || ch !='e' || ch != 'E' || ch != 'i' ||
               ch != 'I' || ch != 'o' || ch != 'O')))
       System.out.println(ch + " is a consonant");
     else {
       System.out.println("Input is invalid input");
     }
   }
 }
