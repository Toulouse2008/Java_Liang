/** Exercise 6.12 Display characters
 *  Write a method that prints characters. This method prints
 *  characters between ch1 and ch2 with the specified numbers
 *  per line. Write a test program that prints ten charachters
 *  per line from 1 to Z, separated by one space.
 */

 import java.util.Scanner;

 public class E612_DisplayCharacters {
   public static void main(String[] args) {

     // Get the inputs from the user
     Scanner input = new Scanner(System.in);
     System.out.println("Enter the start and end characters, and number per line:");
     String str = input.nextLine();
     char ch1 = str.charAt(0);
     char ch2 = str.charAt(1);
     int  number = input.nextInt();

     // Call the printChars method
     printChars(ch1, ch2, number);
   }

   /** Define the printChars method */
   public static void printChars(char ch1, char ch2, int numberPerLine) {

     int count = 0;
     for (int i = (int)ch1; i <= (int)ch2; i++) {
       count++;
       if (count % numberPerLine == 0 && numberPerLine != 0)
         System.out.printf("%c \n", (char)i);
       else
         System.out.printf("%c ", (char)i);
     }
     System.out.println();
   }
 }
