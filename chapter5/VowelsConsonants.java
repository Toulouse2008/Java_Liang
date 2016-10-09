/** Exercise 5.50 Count vowels and consonants
 *  Assume letters A, E, I, O, and U as the vowels. Write a program that prompts
 *  the user to enter a string and displays the number of vowels and consonants
 *  in the string.
 */

 import java.util.Scanner;

 public class VowelsConsonants {
   public static void main(String[] args) {

     // Get the input from the user
     Scanner input = new Scanner(System.in);
     System.out.println("Enter the string: ");
     String str = input.nextLine();
     char ch =' ';

     // Count vowels and consonants
     int vowels = 0;
     int consonants = 0;
     for (int i = 0; i < str.length(); i++) {
       ch = str.charAt(i);
       if(ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' ||
          ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u')
         vowels++;
       else
         consonants++;
     }
     System.out.println("The number of vowels is " + vowels +
            "\nThe number of consonants is " + consonants);
   }
 }
